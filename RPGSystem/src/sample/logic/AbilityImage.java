package sample.logic;

import java.io.File;

public class AbilityImage {
    private File pathToDirectory;

    static AbilityImage hunter = new AbilityImage("C:\\Users\\1nterfector\\IdeaProjects\\RPGSystem\\src\\sample\\image\\abilities\\hunter");
    static AbilityImage mage = new AbilityImage("C:\\Users\\1nterfector\\IdeaProjects\\RPGSystem\\src\\sample\\image\\abilities\\mage");
    static AbilityImage paladin = new AbilityImage("C:\\Users\\1nterfector\\IdeaProjects\\RPGSystem\\src\\sample\\image\\abilities\\paladin");
    static AbilityImage priest = new AbilityImage("C:\\Users\\1nterfector\\IdeaProjects\\RPGSystem\\src\\sample\\image\\abilities\\priest");
    static AbilityImage rogue = new AbilityImage("C:\\Users\\1nterfector\\IdeaProjects\\RPGSystem\\src\\sample\\image\\abilities\\rogue");
    static AbilityImage warrior = new AbilityImage("C:\\Users\\1nterfector\\IdeaProjects\\RPGSystem\\src\\sample\\image\\abilities\\warrior");

    public AbilityImage(String path) {
        this.pathToDirectory = new File(path);
    }

    public File getFile() {
        return pathToDirectory;
    }

    public AbilityImage inner(String imagePath) {
        String path = this.pathToDirectory.toString();
        return new AbilityImage(path + "\\"+ imagePath);
    }
}
