/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upmc.game;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Kiril
 */
public class Joueur{
    
    private int score;
    private List joueur_deck = new LinkedList();
    
    public Joueur(int score){
        this.score = score;
    }
    
    public void AjoutScore(int score){
        this.score+=score;
    }
    
    public void AjoutCarte(String carte){
        joueur_deck.add(carte);
    }
    

    
    public void VoirCarte(int numero){
            System.out.println(joueur_deck.get(numero));
    }
    
    public int VoirCarteValeur(int numero){
        String valor = joueur_deck.get(numero).toString().substring(0, 2);
        return  Integer.parseInt(valor);
    }
    public String VoirCarteColor(int numero){
        String color = joueur_deck.get(numero).toString().substring(3, 4);
        return  color;
    }

    public int Score(){
        return score;
    }
    public String toString(){
        return "score = " + score;
    }
}