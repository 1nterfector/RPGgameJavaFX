package game.logic;

public class Hero {
    private String name;
    private Race race;
    private HeroClass heroClass;


    public Hero(String name, Race race, HeroClass heroClass) {
        this.name = name;
        this.race = race;
        this.heroClass = heroClass;
    }

    @Override
    public String toString() {
        return "Hello my name is "+name+" and I am "+race+" "+heroClass;
    }

    public String getName() {
        return name;
    }

    public Race getRace() {
        return race;
    }

    public HeroClass getHeroClass() {
        return heroClass;
    }
}
