package p4_group_8_repo;

import java.io.File;
import java.util.List;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application {
	AnimationTimer timer;
	MyStage background;
	Animal animal;
	Game game;
	public static Stage MainStage;
	public static void main(String[] args) {

		launch(args);
	}
	
	

	@Override
	public void start(Stage primaryStage) throws Exception { 
		this.MainStage = primaryStage;
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Menu.fxml"));
		Pane pane = (Pane)loader.load();
		primaryStage.setTitle("Frogger");
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();
		game = new Game(primaryStage);
		}

	}


