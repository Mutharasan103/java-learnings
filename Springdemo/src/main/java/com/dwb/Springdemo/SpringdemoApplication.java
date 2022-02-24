package com.dwb.Springdemo;

import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringdemoApplication {

	public static void main(String[] args) {
		final ConfigurableApplicationContext run = SpringApplication.run(SpringdemoApplication.class, args);
		//Mariogame game = new Mariogame();

		//SuperContraGame game = new SuperContraGame();
		//GameRunner runner = new GameRunner(game);
		GameRunner runner = run.getBean(GameRunner.class);
		runner.rungame();
	}

}
