package p4_group_8_repo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;

public class MenuContoller {

    @FXML
    void onExitClicked(ActionEvent event) {
    	System.exit(0); 
    }

    @FXML
    void onHighScoreClicked(ActionEvent event) {

    }

    @FXML
    void onPlayClicked(ActionEvent event) {
    	Stage primaryStage = p4_group_8_repo.Main.MainStage;
    	Game game = new Game(primaryStage);
		primaryStage.show();
    }

}
