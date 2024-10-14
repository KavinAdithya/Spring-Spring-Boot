package com.techcrack.LearningSpring;


import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.techcrack.LearningSpring.Game.*;


@SpringBootApplication
public class LearningSpringCoreApplication {

	public static void main(String[] args) {
		// var marioGame = new MarioGame();
		var superContraGame = new SuperContraGame();
		var gameRunner = new GameRunner(superContraGame);
		
		gameRunner.run();
	}

}
