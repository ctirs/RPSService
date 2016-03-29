package com.rps.service.game;

import com.rps.service.game.player.Player;
import com.rps.service.game.player.strategy.PlayerFixedStrategy;
import com.rps.service.game.rules.GameConstants;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assume.assumeThat;

public class GameTest {
    @Test
    public void testGame() {
        Game game = new Game(new Player(new PlayerFixedStrategy(GameConstants.PAPER)),
                new Player(new PlayerFixedStrategy(GameConstants.ROCK)), 100);
        GameResult result = game.play();
        assumeThat(result.getDraws(), equalTo(0));
        assumeThat(result.getWinA(), equalTo(100));
        assumeThat(result.getWinB(), equalTo(0));

    }

}
