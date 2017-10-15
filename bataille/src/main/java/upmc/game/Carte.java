/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upmc.game;

import java.util.*;
/**
 *
 * @author licence
 */
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