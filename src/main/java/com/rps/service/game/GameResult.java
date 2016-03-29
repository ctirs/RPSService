package com.rps.service.game;

public class GameResult {

    private int winA;
    private int winB;
    private int draws;

    public GameResult() {}

    public int getWinA() {
        return winA;
    }

    public void setWinA(int winA) {
        this.winA = winA;
    }

    public int getWinB() {
        return winB;
    }

    public void setWinB(int winB) {
        this.winB = winB;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }
}
