package com.rps.service.game.player;

import com.rps.service.game.player.strategy.PlayerAction;
import com.rps.service.game.rules.GameConstants;

public class Player implements PlayerAction {

    //later we could think of a list of strategies and a strategy resolver
    private PlayerAction gameStrategy;

    public Player(PlayerAction action) {
        this.gameStrategy = action;
    }

    @Override
    public GameConstants getTurn() {
        return gameStrategy.getTurn();
    }
}
