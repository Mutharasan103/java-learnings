package com.dwb.Springdemo;

import org.springframework.stereotype.Component;

@Component
public class Mariogame implements GamingConsole {
    @Override
    public void up()
    {
        System.out.println("UP");
    }
    @Override
    public void down()
    {
        System.out.println("GO INTO THE SUBWAY");
    }
    @Override
    public void left()
    {
        System.out.println("STOP");
    }
    @Override
    public void right()
    {
        System.out.println("MOVE FORWARD");
    }

}
