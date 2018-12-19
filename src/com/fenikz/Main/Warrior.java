package com.fenikz.Main;

public class Warrior extends Player implements Cast {

    private static final String NAME_WARRIOR = "Woarg";
    private static final String TYPE_WARRIOR = "Guerrier";
    private static final String WARRIOR_BASIC_ATTACK = "Coup d'Epée";
    private static final String WARRIOR_SPECIAL_ATTACK = "Coup de Rage";


    public Warrior(int mPosition, int playerLevel, int playerHealthPoints, int playerHitPoints, int playerAgility) {
        super(playerLevel, playerHealthPoints, playerHitPoints, playerAgility);
    }

    @Override
    String getName() {
        return NAME_WARRIOR;
    }

    @Override
    String getType() {
        return TYPE_WARRIOR;
    }

    @Override
    public void specialAttack(Player player2) {
        int onOpponent = this.getMplayerHitPoints();
        System.out.println(String.format("Joueur %d utilise %s et inflige %d dommages.", this.getmPlayerPosition(),WARRIOR_BASIC_ATTACK, onOpponent));

        player2.setMplayerHealthPoints(onOpponent);

    }

    @Override
    public void basicAttack(Player player2) {
        int onOpponent = this.getMplayerHitPoints()*2;
        System.out.println(String.format("Joueur %d utilise %s et inflige %d dommages.", this.getmPlayerPosition(),WARRIOR_SPECIAL_ATTACK, onOpponent));
        int onPlayer = this.getMplayerHitPoints()/2;

        player2.setMplayerHealthPoints(onOpponent);
        this.setMplayerHealthPoints(onPlayer);

    }
}
