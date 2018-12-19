package com.fenikz.Main;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class Gameplay {

    private ErrorController errorController = new ErrorController();


    private static final int NUMBER_OF_PLAYER = 2;

    private Scanner sc = new Scanner( System.in );
    private int mPosition;
    private int mClass;
    private int mLevel;
    private int mForce;
    private int mAgility;
    private int mIntelligence;
    private int mSum = 0;
    private Player mPlayer;


    private static int getNumberOfPlayer() {
        return NUMBER_OF_PLAYER;
    }

    /**
     * Run the player's creation process
     *
     * @param playerPosition the player's position
     * @return if  it's player 1 or 2
     */
    private Player mPlayerCreation(int playerPosition) {
        System.out.println( String.format( "Création du personnage du Joueur%d", playerPosition ) );

        mClass = askClass();

        mLevel = askStats( "Niveau" );
        mForce = askStats( "Force" );
        mAgility = askStats( "Agilité" );
        mIntelligence = askStats( "Intelligence" );

        switch (mClass) {
            case 1:
                mPlayer = new Warrior(mPosition, mLevel, mForce, mAgility, mIntelligence) {
                };
                break;
            case 2:
                mPlayer = new Prowler(mPosition, mLevel, mForce, mAgility, mIntelligence);
                break;
            case 3:
                mPlayer = new Mage(mPosition, mLevel, mForce, mAgility, mIntelligence);
                break;
        }
        return mPlayer;
    }

    private int askClass() {
        int choice;
        System.out.println( "Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)" );
        while (true) {
            choice = getChoice();
            if (mClass <= 0 || mClass > 3) errorController.inputWrongClassError();
            else break;
        }
        return choice;
    }

    /**
     * Asking for the stats level
     *
     * @param stats = personage stats, value = "Force", "Agilité" or "Intelligence"
     */
    private int askStats(String stats) {
        int
                result;
        String
                article =
                (stats.equals( "Force" )) ? "La" : "L'";
        while (true) {
            System.out.println( String.format( "%s du personnage ?", stats ) );
            result = getChoice();
            if (stats.equals( "Niveau" )) {
                if (result < 1 || result > 100) errorController.inputWrongLevelError();
                else break;
            } else {
                if (result < 0 || result > 100)
                    errorController.inputWrongForceAgilityIntelligenceError( article, stats );
                else if (mSum + result > mLevel || (stats.equals( "Intelligence" ) && mSum + result < mLevel))
                    errorController.totalStatsPlayerError();
                else {
                    mSum +=
                            result;
                    break;
                }
            }
        }
        return result;
    }

    /**
     * Asking for player action fro the turn and display result
     *
     * @param player1 Player playing the turn
     * @param player2 Player opponent
     */
    private void attack(Player player1, Player player2) {
        int attack;
        System.out.println( String.format( "Joueur %d (%d Vitalité) veuillez choisir votre action (1: Attaque Basique, 2 : Attaque Spéciale)", player1.getmPlayerPosition(), player1.getMplayerHealthPoints() ) );
        while (true) {
            attack = getChoice();
            if (attack < 1 || attack > 2) errorController.inputWrongActionError();
            else break;
        }
        switch (attack) {
            case 1: player1.basicAttack(player2);
                break;
            case 2: player1.specialAttack(player2);
                break;
        }
    }
    /**
     * Run the all gameplay
     */
    void runGameplay(){
        Gameplay gameplay = this;
        List<Player> playerList = new ArrayList<>();
        Boolean noLooser = true;

        //Player creation
        for (int i = 0; i < Gameplay.getNumberOfPlayer() ; i++) {
            Player player = gameplay.mPlayerCreation(i+1);
            playerList.add(player);
            mSum = 0;
        }
        // Turn of attack until get a looser
        while (noLooser){
            for (int i = 0; i < Gameplay.getNumberOfPlayer(); i++) {
                int y = (i == 0)? 1:0;
                gameplay.attack(playerList.get(i), playerList.get(y));
                noLooser= gameplay.checkLooser(playerList);
                if (!noLooser) break;
            }
        }
    }

    /**
     * Check if a player have got no more life
     * @param playerList list of Player
     * @return Boolean true = no Looser, false = looser(s)
     */
    Boolean checkLooser(List<Player> playerList) {
        int looser = 0;
        Boolean result = true;
        for (int j = 0; j < playerList.size(); j++) {
            if (playerList.get(j).getMplayerHealthPoints() <= 0) {
                System.out.println(String.format("Joueur %d a perdu !", j + 1));
                looser++;
            }
        }
        if (looser > 0){
            result = false;
            if (looser == playerList.size()) System.out.println("C'est une égalité tous les joueurs sont mort");
        }
        return result;
    }
    /**
     * Check if the answer is an Integer
     * @return the answer (= scanner.nextInt)
     */
    private int getChoice() {
        int result = -1;
        try {
            result = sc.nextInt();
        } catch (InputMismatchException e) {
            sc.nextLine();
            ErrorController error = new ErrorController();
            error.inputIsNotIntError();
        }
        return result;
    }
}