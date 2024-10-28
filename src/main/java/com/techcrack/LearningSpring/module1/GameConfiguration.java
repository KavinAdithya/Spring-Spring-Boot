package com.techcrack.LearningSpring.module1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.techcrack.LearningSpring.module1.Game.*;

@Configuration
public class GameConfiguration {
	@Bean(name = "UpdatedMario")
	@Primary
	public MarioGame marioGame() {
		return new MarioGame();
	}
	
	@Bean
	public SuperContraGame superContraGame() {
		return new SuperContraGame();
	}
	
	@Bean
	public PacMan pacManGame() {
		return new PacMan();
	}
	
	@Bean
	@Primary
	public GameRunner gameMarioRunner() {
		return new GameRunner(marioGame());
	}
	
	@Bean
	@Qualifier("SuperContraGameRunner")
	public GameRunner gameSuperRunner() {
		return new GameRunner(superContraGame());
	}
	
	@Bean
	public GameRunner gamePacRunner() {
		return new GameRunner(pacManGame());
	}
}
