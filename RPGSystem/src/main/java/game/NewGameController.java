package game;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import game.logic.Hero;
import game.logic.HeroClass;
import game.logic.Race;

public class NewGameController {

    @FXML
    private TextField nameField;
    @FXML
    private ComboBox<Race> raceComboBox;
    @FXML
    private ComboBox<HeroClass> heroClassComboBox;
    @FXML
    private ImageView racePicture;
    @FXML
    private ImageView classPicture;
    @FXML
    private Button backToMenu;
    @FXML
    private TextArea description;

    @FXML
    private TextField strengthStat;
    @FXML
    private TextField intellectStat;
    @FXML
    private TextField dexterityStat;
    @FXML
    private TextField staminaStat;
    @FXML
    private TextField healthStat;
    @FXML
    private TextField wisdomStat;
    @FXML
    private TextField luckStat;
    @FXML
    private TextArea classDesc;
    @FXML
    private Button confirmCreation;

    private AbilitiesScene abilitiesScene;
    private ObservableList<Race> raceList =
            FXCollections.observableArrayList(
                    Race.Dwarf,
                    Race.Elf,
                    Race.Gnome,
                    Race.Human,
                    Race.Ork,
                    Race.Tauren,
                    Race.Undead);

    private ObservableList<HeroClass> heroClasses =
            FXCollections.observableArrayList(
                    HeroClass.Hunter,
                    HeroClass.Mage,
                    HeroClass.Paladin,
                    HeroClass.Priest,
                    HeroClass.Rogue,
                    HeroClass.Warrior
            );





    public void initialize() {
        raceComboBox.setItems(raceList);
        heroClassComboBox.setItems(heroClasses);
        raceComboBox.valueProperty().addListener(
                ((observable, oldValue, newValue) -> switchRace(newValue))
        );
        heroClassComboBox.valueProperty().addListener(
                (((observable, oldValue, newValue) -> switchClass(newValue)))
        );
        raceComboBox.getSelectionModel().select(Race.Human);
        heroClassComboBox.getSelectionModel().select(HeroClass.Warrior);
        nameField.setText("Hero");

        strengthStat.setEditable(false);
        intellectStat.setEditable(false);
        dexterityStat.setEditable(false);
        staminaStat.setEditable(false);
        healthStat.setEditable(false);
        wisdomStat.setEditable(false);
        luckStat.setEditable(false);

    }


    @FXML
    public void createHero() throws Exception{
        Hero hero = new Hero(nameField.getText(),raceComboBox.getSelectionModel().getSelectedItem(),heroClassComboBox.getSelectionModel().getSelectedItem());
        abilitiesScene = new AbilitiesScene(hero);
        Stage stage = (Stage) confirmCreation.getScene().getWindow();
        abilitiesScene.start(stage);
    }

    private void switchRace(Race selectedRace) {
        if (selectedRace == null){

        } else {
            setStats(selectedRace);
            description.setText(selectedRace.getDescription());
            racePicture.setImage(selectedRace.getImage());
        }
    }

    private void switchClass(HeroClass selectedClass) {
        if (selectedClass == null) {
        } else {
            classPicture.setImage(selectedClass.getImage());
            classDesc.setText(selectedClass.getDescription());
        }
    }

    @FXML
    public void mainMenuReturn() throws Exception{
        Stage stage = (Stage) backToMenu.getScene().getWindow();
        Main main = new Main();
        main.start(stage);
    }

    private void setStats(Race race) {
        strengthStat.setText(String.valueOf(race.getStatistics().getStrength()));
        intellectStat.setText(String.valueOf(race.getStatistics().getIntellect()));
        dexterityStat.setText(String.valueOf(race.getStatistics().getDexterity()));
        staminaStat.setText(String.valueOf(race.getStatistics().getStamina()));
        healthStat.setText(String.valueOf(race.getStatistics().getHealth()));
        wisdomStat.setText(String.valueOf(race.getStatistics().getWisdom()));
        luckStat.setText(String.valueOf(race.getStatistics().getLuck()));
    }

}
