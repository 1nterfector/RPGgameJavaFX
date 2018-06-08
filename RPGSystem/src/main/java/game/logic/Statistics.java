package game.logic;

public class Statistics {
    private int strength;
    private int intellect;
    private int dexterity;
    private int stamina;
    private int health;
    private int wisdom;
    private int luck;

    public Statistics(int strength, int intellect, int dexterity, int stamina, int health, int wisdom, int luck) {
        this.strength = strength;
        this.intellect = intellect;
        this.dexterity = dexterity;
        this.stamina = stamina;
        this.health = health;
        this.wisdom = wisdom;
        this.luck = luck;
    }

    static Statistics dwarf = new Statistics(11,9,9,11,12,9,9);
    static Statistics elf = new Statistics(8,11,11,9,10,11,10);
    static Statistics gnome = new Statistics(7,11,9,10,10,11,12);
    static Statistics human = new Statistics(10,10,10,10,10,10,10);
    static Statistics ork = new Statistics(13,7,8,12,10,9,11);
    static Statistics tauren = new Statistics(12,8,7,13,12,8,10);
    static Statistics undead = new Statistics(10,10,15,8,10,9,8);

    public int getStrength() {
        return strength;
    }

    public int getIntellect() {
        return intellect;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getStamina() {
        return stamina;
    }

    public int getHealth() {
        return health;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getLuck() {
        return luck;
    }

    @Override
    public String toString() {
        return "Statistics:\n" +
                "\n strength: " + strength +
                "\n intellect: " + intellect +
                "\n dexterity: " + dexterity +
                "\n stamina: " + stamina +
                "\n health: " + health +
                "\n wisdom: " + wisdom +
                "\n luck: " + luck;
    }
}
