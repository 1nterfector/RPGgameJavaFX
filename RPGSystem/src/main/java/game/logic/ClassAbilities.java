package game.logic;

import java.util.*;

public class ClassAbilities {
    private Set<Ability> classAbilities;
    static ClassAbilities warrior = new ClassAbilities(
            Ability.angerManagement, Ability.backStab, Ability.battleShout, Ability.bladeStorm,
            Ability.shield, Ability.ravager, Ability.kingYmiron, Ability.focusedRage,
            Ability.dragonRoar, Ability.bloodBath
    );

    public ClassAbilities(Ability... abilities) {
        this.classAbilities = new HashSet<>();
        List<Ability> temp = Arrays.asList(abilities);

        classAbilities.addAll(temp);
    }

    public Set<Ability> getAbilities() {
        return classAbilities;
    }
}
