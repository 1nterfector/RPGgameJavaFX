package game.logic;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Description {
    private String textDescription;
    static Description dwarf = new Description("race/dwarf.txt");
    static Description elf = new Description("race/elf.txt");
    static Description gnome = new Description("race/gnome.txt");
    static Description human = new Description("race/human.txt");
    static Description tauren = new Description("race/tauren.txt");
    static Description undead = new Description("race/undead.txt");
    static Description ork = new Description("race/ork.txt");

    static Description hunter = new Description("class/hunter.txt");
    static Description mage = new Description("class/mage.txt");
    static Description paladin = new Description("class/paladin.txt");
    static Description priest = new Description("class/priest.txt");
    static Description rogue = new Description("class/rogue.txt");
    static Description warrior = new Description("class/warrior.txt");


    public Description(String fileName) {
        Path path = Paths.get((new File("").getAbsolutePath() + "/src/main/resources/game/descriptions/") +fileName);
        System.out.println(path);
        String line;
        StringBuilder sb = new StringBuilder();

        try (BufferedReader br = Files.newBufferedReader(path)){
            while ((line = br.readLine())!=null) {
                sb.append(line);
            }
        } catch (IOException e) {
            e.getMessage();
        }
        textDescription = sb.toString();
    }


    public String getText() {
        return textDescription;
    }


    static Description angerManagement = new Description("class/abilities/anger_management.txt");
}
