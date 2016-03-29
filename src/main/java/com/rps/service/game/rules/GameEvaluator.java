package com.rps.service.game.rules;

import com.rps.service.game.RPSConstants;

public class GameEvaluator {
    private GameEvaluator() {
    }

    public static int evaluate(RPSConstants a, RPSConstants b) {
        if (a == b) {
            return 0;
        }

        if (a == RPSConstants.PAPER) {
            if (b == RPSConstants.ROCK) {
                return 1;
            }
            return -1;
        }

        if (a == RPSConstants.ROCK) {
            if(b == RPSConstants.PAPER) {
                return 1;
            }
            return -1;
        }
        if(a== RPSConstants.SCISSORS) {
            if(b == RPSConstants.PAPER) {
                return 1;
            }
        }
        return -1;
    }
}
