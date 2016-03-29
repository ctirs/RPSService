package com.rps.service.game.player;

import com.rps.service.game.player.RPSAction;
import com.rps.service.game.rules.RPSConstants;

public class Player implements RPSAction {

    //later we could think of a list of strategies and a strategy resolver
    private RPSAction gameStrategy;

    public Player(RPSAction action) {
        this.gameStrategy = action;
    }

    @Override
    public RPSConstants getTurn() {
        return gameStrategy.getTurn();
    }
}
