
package upmc.game;

import java.util.*;
public class Carte{
    
    // ########## attributs ##########
    
    private String couleur;
    private int valeur;
    
    // ########## constructeur ##########
    
    public Carte (int valeur, String couleur) {
        this.valeur = valeur;
        this.couleur = couleur;
    }
    
    // ########## méthode ########## 
    
    // methode pour comparer les valeur de carte
    public Carte compare(Carte carte2){
        Carte carte = this;
        Carte carteAdverse = carte2;
        Carte carteNull = null;
        if (this.valeur > carte2.valeur) {
            return carte;
        }
        else if (this.valeur < carte2.valeur) {
            return carteAdverse;
        }
        else {
            return carteNull;
        }
    }
    
    // méthode pour afficher une carte
    public String toString(){
        String carte = this.valeur+" "+this.couleur;
        return carte;
    }
    
    // ########## accesseurs (optionnel) ##########
    
    // ########## mutateur (optionnel) ##########
    
}