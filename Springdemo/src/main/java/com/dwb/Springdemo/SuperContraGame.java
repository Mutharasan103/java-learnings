package com.dwb.Springdemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class SuperContraGame implements GamingConsole {
    public void up()
    {
        System.out.println("UP");
    }
    public void down()
    {
        System.out.println("DOWN");
    }
    public void left()
    {
        System.out.println("LEFT");
    }
    public void right()
    {
        System.out.println("RIGHT");
    }

}
