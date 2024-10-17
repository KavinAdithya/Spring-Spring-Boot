package com.techcrack.LearningSpring;


import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.techcrack.LearningSpring.Game.*;


@SpringBootApplication
public class Application01LooseCoupling {

	public static void main(String[] args) {
		var game = new PacMan();
		
		// Loose Coupling
		var gameRunner = new GameRunner(game);
		
		gameRunner.run();
	}

}
