/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upmc.game;

import java.text.DecimalFormat;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Kiril
 */
public class Deck {
    
    private List deck = new LinkedList();

    
    //creation Deck
    public Deck(){
        int i = 1;
        DecimalFormat twodigits = new DecimalFormat("00");
        for(i=1; i<= 13; i++){
            deck.add(new Carte("trefle", twodigits.format(i)));
            deck.add(new Carte("pique", twodigits.format(i)));
            deck.add(new Carte("coeur", twodigits.format(i)));
            deck.add(new Carte("carreau", twodigits.format(i)));
        }       
        Collections.shuffle(deck); //melange
    }

    public void Distribution(Joueur j1, Joueur j2){
        for(int i = 0; i < deck.size(); i++){

           String carte = deck.get(i).toString();
            if(i<=26){
                j1.AjoutCarte(carte);
            }else{
                j2.AjoutCarte(carte);
            }
        }
    }
    
    public void VoirDeck(){
        for(int i = 0; i < 52; i++){
            System.out.println("carte n' " + i + " : " + deck.get(i));
        }
    }
}