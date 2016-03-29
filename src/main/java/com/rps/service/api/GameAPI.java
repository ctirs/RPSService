package com.rps.service.api;

import com.rps.service.game.rules.RPSConstants;
import com.rps.service.game.RPSGame;
import com.rps.service.game.RPSResult;
import com.rps.service.game.player.Player;
import com.rps.service.game.player.strategy.RPSFixedStrategy;
import com.rps.service.game.player.strategy.RPSRandomStrategy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameAPI {

    @RequestMapping("/game")
    public RPSResult caculateGameResult(@RequestParam(value = "rounds", required = false, defaultValue = "100") int rounds) {
        RPSGame game = new RPSGame(new Player(new RPSFixedStrategy(RPSConstants.ROCK)),
                new Player(new RPSRandomStrategy()), rounds);
        return game.play();


    }
}
