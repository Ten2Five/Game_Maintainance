package p4_group_8_repo;
import javafx.animation.AnimationTimer;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Game {
	static AnimationTimer timer;
	static MyStage background;
	static Animal animal;
	
	public Game(Stage primaryStage) {
		background = new MyStage();
		Scene scene = new Scene(background, 600, 800);
		
		BackgroundImage froggerback = new BackgroundImage("file:src/p4_group_8_repo/frogger_background1.gif");
		  
		background.add(froggerback);
		
		add_log();

		add_turtles();

		add_end();
		
		animal = new Animal("file:src/p4_group_8_repo/froggerUp.png");
		background.add(animal);
		add_obstacle();
		background.add(new Digit(0, 30, 300, 760));
		background.start();
		primaryStage.setScene(scene);
		Scores.startScoring();
	}
	
	
	
	
	
	private void add_turtles() {
		background.add(new Turtle(500, 332, -1, 130, 130));
		background.add(new Turtle(300, 332, -1, 130, 130));
		background.add(new WetTurtle(700, 332, -1, 130, 130));
		background.add(new WetTurtle(600, 161, -1, 130, 130));
		background.add(new WetTurtle(400, 161, -1, 130, 130));
		background.add(new WetTurtle(200, 161, -1, 130, 130));
	}

	private void add_log() {
		background.add(new Log("file:src/p4_group_8_repo/log3.png", 150, 0, 110, 0.75));
		background.add(new Log("file:src/p4_group_8_repo/log3.png", 150, 220, 110, 0.75));
		background.add(new Log("file:src/p4_group_8_repo/log3.png", 150, 440, 110, 0.75));

		background.add(new Log("file:src/p4_group_8_repo/logs.png", 300, 0, 231, -2));
		background.add(new Log("file:src/p4_group_8_repo/logs.png", 300, 400, 231, -2));

		background.add(new Log("file:src/p4_group_8_repo/log3.png", 150, 50, 286, 0.75));
		background.add(new Log("file:src/p4_group_8_repo/log3.png", 150, 270, 286, 0.75));
		background.add(new Log("file:src/p4_group_8_repo/log3.png", 150, 490, 286, 0.75));
	}

	private void add_end() {
		background.add(new End(13,34));
		background.add(new End(141,34));
		background.add(new End(141 + 141-13,34));
		background.add(new End(141 + 141-13+141-13+1,34));
		background.add(new End(141 + 141-13+141-13+141-13+3,34));
	}

	private void add_obstacle() {
		background.add(new Obstacle("file:src/p4_group_8_repo/truck1"+"Right.png", 0, 645, 1, 120, 120));
		background.add(new Obstacle("file:src/p4_group_8_repo/truck1"+"Right.png", 300, 645, 1, 120, 120));
		background.add(new Obstacle("file:src/p4_group_8_repo/truck1"+"Right.png", 600, 645, 1, 120, 120));

		background.add(new Obstacle("file:src/p4_group_8_repo/car1Left.png", 100, 590, -1, 50, 50));
		background.add(new Obstacle("file:src/p4_group_8_repo/car1Left.png", 250, 590, -1, 50, 50));
		background.add(new Obstacle("file:src/p4_group_8_repo/car1Left.png", 400, 590, -1, 50, 50));
		background.add(new Obstacle("file:src/p4_group_8_repo/car1Left.png", 550, 590, -1, 50, 50));
		background.add(new Obstacle("file:src/p4_group_8_repo/truck2Right.png", 0, 532, 1, 200, 200));
		background.add(new Obstacle("file:src/p4_group_8_repo/truck2Right.png", 500, 532, 1, 200, 200));
		background.add(new Obstacle("file:src/p4_group_8_repo/car1Left.png", 500, 470, -5, 50, 50));
	}
	
	

	
}
