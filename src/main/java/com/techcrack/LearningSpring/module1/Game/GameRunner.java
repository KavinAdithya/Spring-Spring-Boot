package com.techcrack.LearningSpring.module1.Game;

public class GameRunner {
	private GameConsole game;
	
	public GameRunner(GameConsole game) {
		this.game = game;
	}
	
	public void run() {
		System.out.println("Game is Running....");
		game.up();
		game.down();
		game.right();
		game.left();
	}
}
