package com.fenikz.Main;

public class ErrorController {
    public void totalStatsPlayerError() {
        System.out.println("Attention le total force + agilité + intelligence doit être égal au niveau du joueur");
    }

    public void inputWrongClassError(){
        System.out.println("Veuillez choisir une classe de personnage correcte (1 : Guerrier, 2 : Rôdeur, 3 : Mage)");
    }

    public void inputWrongActionError() {
        System.out.println("Veuillez choisir une action correcte (1: Attaque Basique, 2 : Attaque Spéciale)");
    }

    public void inputWrongLevelError(){
        System.out.println("Le Niveau de personnage doit être compris entre 1 et 100 !");
    }

    public void inputWrongForceAgilityIntelligenceError(String article, String charact){
        System.out.println(String.format("%s %s du personnage doit être comprise entre 0 et 100 !", article, charact));
    }


    public void inputIsNotIntError() {
        System.out.println("Erreur ! Veuillez entrer un nombre.");
    }
}