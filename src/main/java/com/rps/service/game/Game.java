package com.rps.service.game;

import com.rps.service.game.rules.GameEvaluator;
import com.rps.service.game.player.Player;

import java.util.stream.IntStream;

public class Game {

    private Player playerA;

    private Player playerB;

    private int rounds;

    public Game(Player playerA, Player playerB, int rounds) {
        this.playerA = playerA;
        this.playerB = playerB;
        this.rounds = rounds;

    }

    public RPSResult play() {
        RPSResult result = new RPSResult();
        IntStream.range(0, rounds)
                .parallel()
                .map(i -> GameEvaluator.evaluate(playerA.getTurn(), playerB.getTurn()))
                .forEach(i -> {
                    if (i == 0) {
                        result.setDraws(result.getDraws() + 1);
                    } else if (i > 0) {
                        result.setWinA(result.getWinA() + 1);
                    } else {
                        result.setWinB(result.getWinB() + 1);
                    }
                });


        return result;
    }


}
