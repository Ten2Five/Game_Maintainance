package p4_group_8_repo;

import javafx.animation.AnimationTimer;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Scores {
	public static void createTimer() {
		Game.timer = new AnimationTimer() {
			@Override
			public void handle(long now) {
				if (Game.animal.changeScore()) {
					setScoring(Game.animal.getPoints());
				}
				if (Game.animal.getStop()) {
					System.out.print("STOP: Your score is " + Game.animal.getPoints() + "!");
					Game.background.stopMusic();
					stop();
					Game.background.stop();
					Alert alert = new Alert(AlertType.INFORMATION);
					alert.setTitle("You Have Won The Game!");
					alert.setHeaderText("Your High Score: " + Game.animal.getPoints() + "!");
					alert.setContentText("Highest Possible Score: 800");
					alert.show();
				}
			}
		};
	}

	public static void startScoring() {
		Game.background.playMusic();
		createTimer();
		Game.timer.start();
	}


	public void stopScoring() {
		Game.timer.stop();
	}

	public static void setScoring(int n) {
		int shift = 0;
    	while (n > 0) {
    		  int d = n / 10;
    		  int k = n - d * 10;
    		  n = d;
    		  Game.background.add(new Digit(k, 30, 300 - shift, 760));
    		  shift+=30;
		}
	}
}



