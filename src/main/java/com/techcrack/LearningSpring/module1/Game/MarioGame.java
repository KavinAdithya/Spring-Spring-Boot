package com.techcrack.LearningSpring.module1.Game;

public class MarioGame implements GameConsole{
	public MarioGame() {
		
	}
	
	@Override
	public void up() {
		System.out.println("In Mario Game UP.....");
	}
	
	@Override
	public void down() {
		System.out.println("In Mario Game Down.....");
	}
	
	@Override
	public void right() {
		System.out.println("In Mario Game Right.....");
	}
	
	@Override
	public void left() {
		System.out.println("In Mario Game Left......");
	}
}
