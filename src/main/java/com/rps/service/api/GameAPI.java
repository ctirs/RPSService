package com.rps.service.api;

import com.rps.service.game.Game;
import com.rps.service.game.GameResult;
import com.rps.service.game.player.Player;
import com.rps.service.game.player.strategy.PlayerFixedStrategy;
import com.rps.service.game.player.strategy.PlayerRandomStrategy;
import com.rps.service.game.rules.GameConstants;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameAPI {

    @RequestMapping(value = "/game", method = RequestMethod.POST)
    public GameResult caculateGameResult(@RequestParam(value = "rounds", required = false, defaultValue = "100") int rounds) {
        Game game = new Game(new Player(new PlayerFixedStrategy(GameConstants.ROCK)),
                new Player(new PlayerRandomStrategy()), rounds);
        return game.play();


    }
}
