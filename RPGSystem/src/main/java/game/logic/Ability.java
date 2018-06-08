package game.logic;

public class Ability {
    private String name;
    private Description description;
    private AbilityImage image;

    public Ability(String name, Description description, AbilityImage image) {
        this.name = name;
        this.description = description;
        this.image = image;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }
    public Description getDescription() {
        return description;
    }
    public AbilityImage getImage() {
        return image;
    }

    /**
     * All abilities bellow
     */

    static Ability angerManagement = new Ability("Anger Management", Description.angerManagement, AbilityImage.warrior.inner("angermanagement.jpg"));
    static Ability backStab = new Ability("Back Stab", Description.angerManagement, AbilityImage.warrior.inner("backstab.jpg"));
    static Ability battleShout = new Ability("Battle Shout", Description.angerManagement, AbilityImage.warrior.inner("battleshout.jpg"));
    static Ability bladeStorm = new Ability("Blade Storm", Description.angerManagement, AbilityImage.warrior.inner("bladestorm.jpg"));
    static Ability bloodBath = new Ability("Blood Bath", Description.angerManagement, AbilityImage.warrior.inner("bloodbath.jpg"));
    static Ability dragonRoar = new Ability("Dragon Roar", Description.angerManagement, AbilityImage.warrior.inner("dragonroar.jpg"));
    static Ability focusedRage = new Ability("Focused Rage", Description.angerManagement, AbilityImage.warrior.inner("focusedrage.jpg"));
    static Ability shield = new Ability("Shield", Description.angerManagement, AbilityImage.warrior.inner("shield.jpg"));
    static Ability kingYmiron = new Ability("King Ymiron", Description.angerManagement, AbilityImage.warrior.inner("kingymiron.jpg"));
    static Ability ravager = new Ability("Ravager", Description.angerManagement, AbilityImage.warrior.inner("ravager.jpg"));


}
