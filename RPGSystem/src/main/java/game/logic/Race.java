package game.logic;

import javafx.scene.image.Image;

public enum Race {
    Elf (Description.elf, Statistics.elf, Picture.elf),
    Human (Description.human, Statistics.human, Picture.human),
    Dwarf (Description.dwarf, Statistics.dwarf, Picture.dwarf),
    Gnome (Description.gnome, Statistics.gnome, Picture.gnome),
    Undead (Description.undead, Statistics.undead, Picture.undead),
    Tauren (Description.tauren, Statistics.tauren, Picture.tauren),
    Ork (Description.ork, Statistics.ork, Picture.ork);

    private Description description;
    private Statistics statistics;
    private Picture image;


    Race(Description description,Statistics statistics, Picture image) {
        this.description = description;
        this.statistics = statistics;
        this.image = image;
    }

    public String getDescription() {
        return this.description.getText();
    }


    public Statistics getStatistics() {
        return statistics;
    }

    public Image getImage() {
        return image.getImage();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
