package game.logic;

import java.io.File;

public class AbilityImage {
    private File pathToDirectory;

    static AbilityImage hunter = new AbilityImage("src/main/resources/game/image/abilities/hunter");
    static AbilityImage mage = new AbilityImage("src/main/resources/game/image/abilities/mage");
    static AbilityImage paladin = new AbilityImage("src/main/resources/game/image/abilities/paladin");
    static AbilityImage priest = new AbilityImage("src/main/resources/game/image/abilities/priest");
    static AbilityImage rogue = new AbilityImage("src/main/resources/game/image/abilities/rogue");
    static AbilityImage warrior = new AbilityImage("src/main/resources/game/image/abilities/warrior");

    public AbilityImage(String path) {
        this.pathToDirectory = new File(path);
    }

    public File getFile() {
        return pathToDirectory;
    }

    public AbilityImage inner(String imagePath) {
        String path = this.pathToDirectory.toString();
        return new AbilityImage(path + "/"+ imagePath);
    }
}
