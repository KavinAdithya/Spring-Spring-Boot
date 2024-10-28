package com.techcrack.LearningSpring.module2.driver;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.techcrack.LearningSpring.module2.game.GameRunner;

@Configuration
@ComponentScan(basePackages = "com.techcrack.LearningSpring.module2.game")
public class ConfigurationGame {
	public static void main(String[] args) {
		try (var context =
						new AnnotationConfigApplicationContext(ConfigurationGame.class)) {
			var runner = context.getBean(GameRunner.class);
			runner.run();
		}
	}
}
