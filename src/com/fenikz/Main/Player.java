package com.fenikz.Main;

public abstract class Player {
    private String mplayerClass; 
    private int mplayerLevel; 
    private int mplayerHealthPoints; 
    private int mplayerHitPoints; 
    private int mplayerAgility; 
    private int mplayerIntelligence; 
    private int mPlayerPosition;

    /**
     * Player's stats creation
     * @param playerLevel player's level between 0 and 100
     * @param playerHealthPoints player's life
     * @param playerHitPoints player's force
     * @param playerAgility player's agility
     */

    protected Player(String playerClass, int playerLevel, int playerHealthPoints, int playerHitPoints, int playerAgility, int playerIntelligence, int playerPosition) {
        this.mplayerClass = playerClass;
        this.mplayerLevel = playerLevel;
        this.mplayerHealthPoints = defaultLife();
        this.mplayerHitPoints = playerHitPoints;
        this.mplayerAgility = playerAgility;
        this.mplayerIntelligence = playerIntelligence;
        this.mPlayerPosition = playerPosition;
    }

    /**
     * Read Player's name
     * @return Player's name
     */
    abstract String getName();

    /**
     * Read player's class type
     * @return player's class type
     */
    abstract String getType();

    abstract void basicAttack(Player player2);
    abstract void specialAttack(Player player2);

    protected String getMplayerClass() {
        return mplayerClass;
    }

    protected void setMplayerClass(String mplayerClass) {
        this.mplayerClass = mplayerClass;
    }

    protected int getMplayerLevel() {
        return mplayerLevel;
    }

    protected void setMplayerLevel(int mplayerLevel) {
        this.mplayerLevel = mplayerLevel;
    }

    protected int getMplayerHealthPoints() {
        return mplayerHealthPoints;
    }

    protected void setMplayerHealthPoints(int mplayerHealthPoints) {
        this.mplayerHealthPoints = mplayerHealthPoints;
    }

    /**
     * get the level of life when Player is instantiate
     * @return mplayerHealthPoints as playerLevel * 5
     */
    protected int defaultLife(){
        int playerLevel = this.getMplayerLevel();
        int mplayerHealthPoints = playerLevel * 5;

        return mplayerHealthPoints;
    }

    protected int getMplayerHitPoints() {
        return mplayerHitPoints;
    }

    protected int getMplayerAgility() {
        return mplayerAgility;
    }

    protected void setMplayerAgility(int mplayerAgility) {
        this.mplayerAgility = mplayerAgility;
    }

    protected int getMplayerIntelligence() {
        return mplayerIntelligence;
    }

    protected void setMplayerIntelligence(int mplayerIntelligence) {
        this.mplayerIntelligence = mplayerIntelligence;
    }

    protected int getmPlayerPosition() {
        return mPlayerPosition;
    }


    /**
     * Display the instantiation of a player
     */
    protected void selection() {
        String selection = String.format("%s je suis le %s Joueur %d niveau %d je possède %d de vitalité, %d de force, %d d'agilité et %d d'intelligence !",
                this.getName(),this.getType(),this.getmPlayerPosition(), this.getMplayerLevel(), this.defaultLife(), this.getMplayerHitPoints(),
                this.getMplayerAgility(), this.getMplayerIntelligence());
        System.out.println(selection);
    }
}
