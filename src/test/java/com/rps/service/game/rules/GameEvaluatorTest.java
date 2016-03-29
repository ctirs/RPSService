package com.rps.service.game.rules;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assume.assumeThat;

@RunWith(Parameterized.class)
public class GameEvaluatorTest {

    private GameConstants first;

    private GameConstants second;

    private int expectedResult;

    public GameEvaluatorTest(GameConstants first, GameConstants second,
                             int expectedResult) {
        this.first = first;
        this.second = second;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {GameConstants.PAPER, GameConstants.PAPER, 0},
                {GameConstants.PAPER, GameConstants.ROCK, 1},
                {GameConstants.PAPER, GameConstants.SCISSORS, -1},
                {GameConstants.ROCK, GameConstants.PAPER, -1},
                {GameConstants.ROCK, GameConstants.ROCK, 0},
                {GameConstants.ROCK, GameConstants.SCISSORS, 1},
                {GameConstants.SCISSORS, GameConstants.PAPER, 1},
                {GameConstants.SCISSORS, GameConstants.ROCK, -1},
                {GameConstants.SCISSORS, GameConstants.SCISSORS, 0},
        });
    }

    @Test
    public void testEvaluation() {
        assumeThat(GameEvaluator.evaluate(first, second), equalTo(expectedResult));
    }
}
