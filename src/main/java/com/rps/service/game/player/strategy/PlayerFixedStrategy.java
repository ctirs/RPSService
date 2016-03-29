package com.rps.service.game.player.strategy;

import com.rps.service.game.player.PlayerAction;
import com.rps.service.game.rules.RPSConstants;

public class PlayerFixedStrategy implements PlayerAction {

    private RPSConstants fixedResult;

    public PlayerFixedStrategy(RPSConstants fixed) {
        this.fixedResult = fixed;
    }

    @Override
    public RPSConstants getTurn() {
        return fixedResult;
    }
}
