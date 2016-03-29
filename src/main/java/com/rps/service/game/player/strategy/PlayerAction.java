package com.rps.service.game.player.strategy;

import com.rps.service.game.rules.RPSConstants;

public interface PlayerAction {

    default RPSConstants getTurn() {
        return RPSConstants.ROCK;
    }
}
