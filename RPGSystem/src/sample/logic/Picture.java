package sample.logic;

import javafx.scene.image.Image;

public class Picture {
    private Image image;
    
    static Picture dwarf = new Picture(new Image("sample/image/race/dwarf.jpg"));
    static Picture elf = new Picture(new Image("sample/image/race/elf.jpg"));
    static Picture gnome = new Picture(new Image("sample/image/race/gnome.jpg"));
    static Picture human = new Picture(new Image("sample/image/race/human.jpg"));
    static Picture ork = new Picture(new Image("sample/image/race/ork.jpg"));
    static Picture tauren = new Picture(new Image("sample/image/race/tauren.jpg"));
    static Picture undead = new Picture(new Image("sample/image/race/undead.jpg"));

    static Picture hunter = new Picture(new Image("sample/image/class/hunter.png"));
    static Picture mage = new Picture(new Image("sample/image/class/mage.png"));
    static Picture paladin = new Picture(new Image("sample/image/class/paladin.png"));
    static Picture priest = new Picture(new Image("sample/image/class/priest.png"));
    static Picture rogue = new Picture(new Image("sample/image/class/rogue.png"));
    static Picture warrior = new Picture(new Image("sample/image/class/warrior.png"));

    public Picture(Image image) {
        this.image = image;
    }

    public Image getImage() {
        return image;
    }
}
