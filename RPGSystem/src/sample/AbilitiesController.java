package sample;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import sample.logic.Ability;
import sample.logic.ClassAbilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static sample.AbilitiesScene.hero;

public class AbilitiesController {
    @FXML
    private Label heroName;
    @FXML
    private Label heroRace;
    @FXML
    private Label heroClass;
    @FXML
    private GridPane grid;
    @FXML
    private Button goBack;
    @FXML
    private GridPane chosenGrid;
    private int iterator = 0;

    private ClassAbilities classAbilities;
    private Ability[] chosenAbilities;
    private List<ToggleButton> listOfButtons;
    private List<ToggleButton> chosenButtons;

    public void initialize() {
        listOfButtons = new ArrayList<>();
        chosenButtons = new ArrayList<>();

        classAbilities = hero.getHeroClass().getClassAbilities();
        chosenAbilities = hero.getHeroClass().getChosenAbilities();
        grid.setAlignment(Pos.TOP_CENTER);
        grid.setHgap(20);
        grid.setVgap(20);
        heroName.setText(hero.getName());
        heroRace.setText(hero.getRace().toString());
        heroClass.setText(hero.getHeroClass().toString());
        insertImages();








    }

    private void insertImages() {
        int column = 0;
        int row = 0;
        Set<Ability> abilitiesSet = classAbilities.getAbilities();

        for (Ability ability:abilitiesSet) {
            ToggleButton button = createToggleButton(ability);
            button.setOnAction(event -> {
                if (iterator <= 3) {
                    button.setDisable(true);
                    ToggleButton newButton = createToggleButton(ability);
                    hero.getHeroClass().choseAbility(ability);
                    newButton.setOnAction(newEvent -> {
                        if (iterator == 4) {
                            something();
                        }
                        iterator = GridPane.getColumnIndex(newButton);
                        chosenGrid.getChildren().remove(newButton);
                        if (iterator != 4) {
                            GridPane
                        }
                        button.setDisable(false);
                    });
                    chosenButtons.add(button);
                    chosenGrid.add(newButton, iterator, 0);
                    iterator++;
                    disableAll();
                }
            });
            listOfButtons.add(button);
            grid.add(button,column,row);
            column++;
            if (column == 5) {
                row++;
                column = 0;
            }
        }


    }

    @FXML
    public void goBack() throws Exception{
        Stage stage = (Stage) goBack.getScene().getWindow();
        NewGameScene newGameScene = new NewGameScene();
        newGameScene.start(stage);
    }

    private ToggleButton createToggleButton(Ability ability) {
        String fullPath = "file:"+ability.getImage().getFile();
        ToggleButton button = new ToggleButton();
        button.setGraphic(new ImageView(new Image(fullPath)));
        button.setTooltip(new Tooltip(ability.getDescription().getText()));
        button.setId(ability.toString());
        return button;
    }

    private void disableAll() {
        if (iterator == 4) {
            for (Node node : grid.getChildren()) {
                ToggleButton button = (ToggleButton) node;
                button.setDisable(true);
            }
        }
    }

    private void something() {
            List<ToggleButton> list = new ArrayList<>();
            list.addAll(listOfButtons);
            list.removeAll(chosenButtons);

            list.forEach(toggleButton -> {
                toggleButton.setDisable(false);
            });
    }



}
