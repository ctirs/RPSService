package com.rps.service.game.player.strategy;

import com.rps.service.game.rules.GameConstants;

public class PlayerFixedStrategy implements PlayerAction {

    private GameConstants fixedResult;

    public PlayerFixedStrategy(GameConstants fixed) {
        this.fixedResult = fixed;
    }

    @Override
    public GameConstants getTurn() {
        return fixedResult;
    }
}
