package Player;

public class Warrior extends Player {

    private static final String NAME_WARRIOR = "Woarg";
    private static final String TYPE_WARRIOR = "Guerrier";
    private static final String WARRIOR_BASIC_ATTACK = "Coup d'Epée";
    private static final String WARRIOR_SPECIAL_ATTACK = "Coup de Rage";

    public Warrior(String playerClass, int playerLevel, int playerHealthPoints, int playerHitPoints, int playerAgility, int playerintelligence, int basicAttack, int specialAttack) {
        super( playerClass, playerLevel, playerHealthPoints, playerHitPoints, playerAgility, playerintelligence );
        this.selection();
    }

    @Override
    String getName() {
        return NAME_WARRIOR;
    }

    @Override
    String getType() {
        return TYPE_WARRIOR;
    }
}

