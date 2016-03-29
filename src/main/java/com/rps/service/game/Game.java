package com.rps.service.game;

import com.rps.service.game.player.Player;
import com.rps.service.game.rules.GameEvaluator;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Set;
import java.util.stream.IntStream;

public class Game {

    private Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

    @NotNull
    private Player playerA;

    @NotNull
    private Player playerB;

    @Min(value = 1)
    private int rounds;

    public Game(Player playerA, Player playerB, int rounds) {
        this.playerA = playerA;
        this.playerB = playerB;
        this.rounds = rounds;
        Set<ConstraintViolation<Game>> constraintViolations = validator.validate(this);
        if (!constraintViolations.isEmpty()) {
            throw new ConstraintViolationException(constraintViolations);
        }
    }

    public GameResult play() {
        GameResult result = new GameResult();
        IntStream.range(0, rounds)
                .map(i -> GameEvaluator.evaluate(playerA.getTurn(), playerB.getTurn()))
                .forEach(i -> {
                    if (i == 0) {
                        result.setDraws(result.getDraws() + 1);
                    } else if (i > 0) {
                        result.setWinA(result.getWinA() + 1);
                    } else {
                        result.setWinB(result.getWinB() + 1);
                    }
                });

        return result;
    }

}
