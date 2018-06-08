package game;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;



public class Controller {

    @FXML
    private Button newGame;

    private NewGameScene newGameScene;

    public void initialize() {
        newGameScene = new NewGameScene();

    }

    @FXML
    public void newGameDialog() throws Exception{
        Stage stage = (Stage) newGame.getScene().getWindow();
        newGameScene.start(stage);
    }
}
