package game.logic;

import javafx.scene.image.Image;

public class Picture {
    private Image image;
    
    static Picture dwarf = new Picture(new Image("game/image/race/dwarf.jpg"));
    static Picture elf = new Picture(new Image("game/image/race/elf.jpg"));
    static Picture gnome = new Picture(new Image("game/image/race/gnome.jpg"));
    static Picture human = new Picture(new Image("game/image/race/human.jpg"));
    static Picture ork = new Picture(new Image("game/image/race/ork.jpg"));
    static Picture tauren = new Picture(new Image("game/image/race/tauren.jpg"));
    static Picture undead = new Picture(new Image("game/image/race/undead.jpg"));

    static Picture hunter = new Picture(new Image("game/image/class/hunter.png"));
    static Picture mage = new Picture(new Image("game/image/class/mage.png"));
    static Picture paladin = new Picture(new Image("game/image/class/paladin.png"));
    static Picture priest = new Picture(new Image("game/image/class/priest.png"));
    static Picture rogue = new Picture(new Image("game/image/class/rogue.png"));
    static Picture warrior = new Picture(new Image("game/image/class/warrior.png"));

    public Picture(Image image) {
        this.image = image;
    }

    public Image getImage() {
        return image;
    }
}
