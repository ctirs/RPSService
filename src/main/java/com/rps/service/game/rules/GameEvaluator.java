package com.rps.service.game.rules;

public class GameEvaluator {
    private GameEvaluator() {
    }

    public static int evaluate(GameConstants a, GameConstants b) {
        if (a == b) {
            return 0;
        }

        if (a == GameConstants.PAPER) {
            if (b == GameConstants.ROCK) {
                return 1;
            }
            return -1;
        }

        if (a == GameConstants.ROCK) {
            if (b == GameConstants.PAPER) {
                return -1;
            }
            return 1;
        }
        if (a == GameConstants.SCISSORS) {
            if (b == GameConstants.PAPER) {
                return 1;
            }
        }
        return -1;
    }
}
