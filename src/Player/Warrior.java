package Player;

public class Warrior extends Player {

    private int basicAttack;
    private int specialAttack;

    public Warrior(String playerClass, int playerLevel, int playerHealthPoints, int playerHitPoints, int playerAgility, int playerintelligence, int basicAttack, int specialAttack) {
        super( playerClass, playerLevel, playerHealthPoints, playerHitPoints, playerAgility, playerintelligence );
        this.basicAttack = basicAttack;
        this.specialAttack = specialAttack;
    }

    public int getBasicAttack() {
        return basicAttack;
    }

    public int getSpecialAttack() {
        return specialAttack;
    }


    @Override
    public void selection() {
        System.out.println("Aaargh je suis " + playerClass + get.Playernb() + playerLevel + je possède );
    }
}

