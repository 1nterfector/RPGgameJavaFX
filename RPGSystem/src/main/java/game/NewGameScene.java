package game;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class NewGameScene {

    public void start(Stage window) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("new_game.fxml"));
        root.getStylesheets().add("http://fonts.googleapis.com/css?family=Rammetto+One");
        root.getStylesheets().add("http://fonts.googleapis.com/css?family=Rubik+Mono+One");
        Scene scene = new Scene(root, 1200, 800);
        window.setScene(scene);
        window.show();
    }
}
