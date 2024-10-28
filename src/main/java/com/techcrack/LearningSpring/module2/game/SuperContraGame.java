package com.techcrack.LearningSpring.module2.game;

import org.springframework.stereotype.Component;

@Component
public class SuperContraGame implements GameConsole {
	
	@Override
	public void up() {
		System.out.println("In Super Contra Game UP.....");
	}
	
	@Override
	public void down() {
		System.out.println("In Super Contra Game Down.....");
	}
	
	@Override
	public void right() {
		System.out.println("In Super Contra Game Right.....");
	}
	
	@Override
	public void left() {
		System.out.println("In Super Contra Game Left......");
	}
	
	
}
