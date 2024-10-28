package com.techcrack.LearningSpring.module1;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.techcrack.LearningSpring.module1.Game.*;


@SpringBootApplication
public class Application01LooseCoupling {

	public static void main(String[] args) {
		try (var context =
				new AnnotationConfigApplicationContext(GameConfiguration.class)) {
			
			var game = (MarioGame) context.getBean("marioGame");
			game.down();
//			var game1 = context.getBean(SuperContraGame.class);
//			var game2 = context.getBean(PacMan.class);
			
//			var runner = (GameRunner)context.getBean("SuperContraGameRunner");
//			runner.run();
			
		}
	}

}
