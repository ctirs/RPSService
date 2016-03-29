package com.rps.service.game.player.strategy;

import com.rps.service.game.rules.GameConstants;

public interface PlayerAction {

    default GameConstants getTurn() {
        return GameConstants.ROCK;
    }
}
