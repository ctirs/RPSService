package com.rps.service.game.player.strategy;

import com.rps.service.game.rules.GameConstants;

import java.security.SecureRandom;

public class PlayerRandomStrategy implements PlayerAction {

    //thx findbugs
    private SecureRandom random = new SecureRandom();

    @Override
    public GameConstants getTurn() {
        double randomDouble = random.nextDouble();
        if (randomDouble <= 0.33) {
            return GameConstants.ROCK;
        } else if (randomDouble <= 0.66) {
            return GameConstants.PAPER;
        }
        return GameConstants.SCISSORS;
    }
}
