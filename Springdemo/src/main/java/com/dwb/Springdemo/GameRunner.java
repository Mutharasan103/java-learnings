package com.dwb.Springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

    //private Mariogame game;
    //private SuperContraGame game;

    @Autowired
    private GamingConsole game;
    public GameRunner(GamingConsole game)
    {
        this.game = game;
    }
    public void rungame()
    {
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
