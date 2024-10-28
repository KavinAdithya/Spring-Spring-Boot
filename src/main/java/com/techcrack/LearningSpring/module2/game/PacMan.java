package com.techcrack.LearningSpring.module2.game;

import org.springframework.stereotype.Component;

@Component
public class PacMan implements GameConsole{
	
	@Override
	public void up() {
		System.out.println("In Pac Man Up Button...");
	}
	
	@Override
	public void down() {
		System.out.println("In Pac Man Dowm Button...");
	}
	
	@Override
	public void right() {
		System.out.println("In Pac Man Right Button...");
	}
	
	@Override
	public void left() {
		System.out.println("In Pac Man Left Button...");
	}

}
