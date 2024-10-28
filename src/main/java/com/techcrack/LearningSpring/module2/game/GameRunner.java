package com.techcrack.LearningSpring.module2.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	@Autowired
	private GameConsole game;
	
//	@Autowired
//	public GameRunner(GameConsole game) {
//		this.game = game;
//	}
	
	public void run() {
		System.out.println("Game is Running....");
		game.up();
		game.down();
		game.right();
		game.left();
	}
}
