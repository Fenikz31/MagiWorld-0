package Player;

Level level = new level int();
HitPoints hitPoints = new hitpoints()

public abstract class Player {
    private String playerClass;
    private int playerLevel;
    private int playerHealthPoints;
    private int playerHitPoints;
    private int playerAgility;
    private int playerintelligence;

    public Player(String playerClass, int playerLevel, int playerHealthPoints, int playerHitPoints, int playerAgility, int playerintelligence) {
        this.playerClass = playerClass;
        this.playerLevel = playerLevel;
        this.playerHealthPoints = playerHealthPoints;
        this.playerHitPoints = playerHitPoints;
        this.playerAgility = playerAgility;
        this.playerintelligence = playerintelligence;
    }

    public abstract void selection();
}
