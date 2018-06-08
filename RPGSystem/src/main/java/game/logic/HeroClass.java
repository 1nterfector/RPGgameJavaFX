package game.logic;

import javafx.scene.image.Image;

import java.io.File;
import java.util.Set;

public enum HeroClass {
    Paladin(Description.paladin, Picture.paladin, AbilityImage.paladin),
    Mage(Description.mage, Picture.mage, AbilityImage.mage),
    Warrior(Description.warrior, Picture.warrior, AbilityImage.warrior, ClassAbilities.warrior),
    Rogue(Description.rogue, Picture.rogue, AbilityImage.rogue),
    Hunter(Description.hunter, Picture.hunter, AbilityImage.hunter),
    Priest(Description.priest, Picture.priest, AbilityImage.priest);

    private Description description;
    private Picture picture;
    private AbilityImage pathToAbilities;
    private ClassAbilities classAbilities;
    private Ability[] chosenAbilities;



    HeroClass(Description description, Picture picture, AbilityImage pathToAbilities,ClassAbilities classAbilities) {
        this.description = description;
        this.picture = picture;
        this.pathToAbilities = pathToAbilities;
        this.classAbilities = classAbilities;
        chosenAbilities = new Ability[4];
    }

    HeroClass(Description description, Picture picture, AbilityImage pathToAbilities) {
        this(description,picture,pathToAbilities,null);
    }

    public Image getImage() {
        return picture.getImage();
    }
    public String getDescription() {
        return description.getText();
    }
    public File getFile() { return pathToAbilities.getFile(); }
    public ClassAbilities getClassAbilities() {
        return classAbilities;
    }
    public Ability[] getChosenAbilities() {
        return chosenAbilities;
    }

    public void choseAbility(Ability name) {
        Set<Ability> set = this.classAbilities.getAbilities();
        set.forEach(ability -> {
            if (ability.toString().equalsIgnoreCase(name.toString())) {
                for (int i = 0; i < chosenAbilities.length; i++) {
                    if (chosenAbilities[i]==null) {
                        chosenAbilities[i] = ability;
                    }
                }
                return;
            }
        });
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
