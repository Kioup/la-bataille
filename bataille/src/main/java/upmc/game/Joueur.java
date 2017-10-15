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
public class Joueur {
    
            // ########## attributs ##########
    
    int score;
    String nom;
    private ArrayList paquet = new ArrayList();
    
            // ########## constructeur ##########

    public Joueur(int score, String nom) {
        this.score = score;
        this.nom = nom;
    }    
    
            // ########## méthode ########## 
    
    public String Gagnant(Joueur j1, Joueur j2) {
        if (j1.score > j2.score) {
            return j1.nom;
        }
        else if (j1.score < j2.score) {
            return j2.nom;
        }
        else {
            return "Egalite entre les deux joueurs";
        }
    }
    
    public String toString() {
        return this.nom;
    }
    
    public String VoirPaquet(ArrayList Tas) {
        String str = "";
        for (int i=0; i<Tas.size();i++) {
            str = str + Tas.get(i)+"\n";
        }
        return str;
    }
    
    public Carte Pioche(int i) {
        Carte carte;
        carte = (Carte) this.getPaquet().get(i);
        return carte;
    }
    
    // ########## mutateur (optionnel) ##########

    public void setPaquet(ArrayList paquet) {
        this.paquet = paquet;
    }
    
    // ########## accesseurs (optionnel) ##########
    
    public ArrayList getPaquet() {
        return paquet;
    }

    
}
