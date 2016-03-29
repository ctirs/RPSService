package com.rps.service.api;

import com.rps.service.game.GameResult;
import org.junit.Test;

import javax.validation.ConstraintViolationException;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assume.assumeThat;

public class GameAPITest {

    private GameAPI gameAPI = new GameAPI();

    @Test
    public void testApiFor1Round() {
        GameResult result = gameAPI.caculateGameResult(1);
        assumeThat(result.getDraws() + result.getWinA() + result.getWinB(),
                equalTo(1));
    }

    @Test(expected = ConstraintViolationException.class)
    public void testApiForWrongInput() {
        gameAPI.caculateGameResult(-1);
    }
}
