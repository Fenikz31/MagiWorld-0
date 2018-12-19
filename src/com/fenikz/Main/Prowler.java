package com.fenikz.Main;

public class Prowler extends Player implements Cast {

    private static final String NAME_PROWLER = "Ninja";
    private static final String TYPE_PROWLER = "Rôdeur";
    private static final String PROWLER_BASIC_ATTACK = "Tir à l'Arc";
    private static final String PROWLER_SPECIAL_ATTACK = "Concentration";

    public Prowler(int playerLevel, int playerHealthPoints, int playerHitPoints, int playerAgility, int playerintelligence) {
        super(playerLevel, playerHealthPoints, playerHitPoints, playerAgility );

    }

    @Override
    String getName() {
        return NAME_PROWLER;
    }

    @Override
    String getType() {
        return TYPE_PROWLER;
    }

    @Override
    public void specialAttack(Player player2) {
        int onOpponent = this.getMplayerAgility();
        System.out.println(String.format("Joueur %d utilise %s et inflige %d dommages.", this.getmPlayerPosition(), PROWLER_BASIC_ATTACK, onOpponent));

        player2.setMplayerHealthPoints(onOpponent);

    }

    @Override
    public void basicAttack(Player player2) {
        int onPlayer = this.getMplayerLevel()/2;
        System.out.println(String.format("Joueur %d utilise %s et gagne %d en agilité.", this.getmPlayerPosition(), PROWLER_SPECIAL_ATTACK, onPlayer));

        this.setMplayerAgility(onPlayer);

    }
}
