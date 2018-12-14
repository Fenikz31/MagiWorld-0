package Player;

public class Mage extends Player{

    private int basicAttack;
    private int specialAttack;

    public Mage(String playerClass, int playerLevel, int playerHealthPoints, int playerHitPoints, int playerAgility, int playerintelligence, int basicAttack, int specialAttack) {
        super( playerClass, playerLevel, playerHealthPoints, playerHitPoints, playerAgility, playerintelligence );
        this.basicAttack =
                basicAttack;
        this.specialAttack =
                specialAttack;
    }

    public int getBasicAttack() {
        return basicAttack;
    }

    public int getSpecialAttack() {
        return specialAttack;
    }
}
