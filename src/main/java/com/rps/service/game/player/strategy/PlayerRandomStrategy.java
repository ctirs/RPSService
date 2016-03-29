package com.rps.service.game.player.strategy;


import com.rps.service.game.player.PlayerAction;
import com.rps.service.game.rules.RPSConstants;

import java.util.Random;

public class PlayerRandomStrategy implements PlayerAction {

    private Random random = new Random();

    @Override
    public RPSConstants getTurn() {
        double randomDouble = random.nextDouble();
        if (randomDouble <= 0.33) {
            return  RPSConstants.ROCK;
        } else if (randomDouble <= 0.66) {
            return RPSConstants.PAPER;
        }
        return  RPSConstants.SCISSORS;
    }
}
