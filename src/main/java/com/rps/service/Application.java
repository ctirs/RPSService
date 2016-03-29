package com.rps.service;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.rps.service.api.GameAPI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackageClasses = {GameAPI.class})
public class Application {

    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public Docket petApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(Predicates.not(
                        RequestHandlerSelectors.basePackage("org.springframework.boot")))
                .paths(paths())
                .build();

    }

    private Predicate<String> paths() {
        return Predicates.not(PathSelectors.regex("/basic-error-controller.*"));
    }

}