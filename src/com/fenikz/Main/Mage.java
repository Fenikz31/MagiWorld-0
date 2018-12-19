package com.fenikz.Main;

public class Mage extends Player implements Cast {

    public static final String NAME_MAGE = "Abracadabra";
    public static final String TYPE_MAGE = "Mage";
    public static final String MAGE_BASIC_ATTACK = "Boule de Feu";
    public static final String MAGE_SPECIAL_ATTACK = "Soin";

    public Mage(int playerLevel, int playerHealthPoints, int playerHitPoints, int playerAgility) {
        super( playerLevel, playerHealthPoints, playerHitPoints, playerAgility );
    }

    @Override
    String getName() {
        return NAME_MAGE;
    }

    @Override
    String getType() {
        return TYPE_MAGE;
    }

    @Override
    public void basicAttack(Player player2) {
        int onOpponent = this.getMplayerIntelligence();
        System.out.println(String.format("Joueur %d utilise %s et inflige %d dommages.", this.getmPlayerPosition(), MAGE_BASIC_ATTACK, onOpponent));

        player2.setMplayerHealthPoints(onOpponent);
    }

    @Override
    public void specialAttack(Player player2) {
        int onPlayer = this.getMplayerIntelligence()*2;

        int startLife = this.defaultLife();
        int actualLife = this.getMplayerHealthPoints();

        if (actualLife + onPlayer < startLife) {
            this.setMplayerHealthPoints(actualLife + onPlayer);
            System.out.println(String.format("Joueur %d utilise %s et gagne %d en vitalité.", this.getmPlayerPosition(), MAGE_SPECIAL_ATTACK, onPlayer));
        }
        else {
            this.setMplayerHealthPoints(startLife);
            System.out.println(String.format("Joueur %d utilise %s et gagne %d en vitalité.", this.getmPlayerPosition(), MAGE_SPECIAL_ATTACK, startLife - actualLife));
        }
    }
}