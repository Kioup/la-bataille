package upmc.game;

import java.util.*;

public class Paquet {
    
        // ########## attributs ##########
    
    public ArrayList<Carte> paquet = new ArrayList();
    public ArrayList<Carte> test = new ArrayList();
    
        // ########## constructeur ##########
    
    public Paquet() {
    this.paquet = creationPaquet();
    }
    
        // ########## méthode ########## 
    
    private ArrayList creationPaquet(){
        String [] color = {"coeur","pique","trefle","carreau"};
        for (int i=0; i<color.length; i++) {
            for (int y=2; y<15; y++) {
                String couleur = color[i];
                int valeur = y;
                Carte carte = new Carte(valeur, couleur);
                paquet.add(carte);
            }
        }
        return paquet;
    }
    
   public String toString() {
        ArrayList deck = this.paquet;
        String str="";
        for(int i=0; i<deck.size();i++){
          str=str + deck.get(i)+"\n";
      }
        return str;
    }
   
   public ArrayList melangePaquet() {
       int i;
       while (this.paquet.size()>0){
           i = (int)(Math.random() * (this.paquet.size()-0));
           this.test.add(this.paquet.get(i));
           this.paquet.remove(i);
           // System.out.println(this.paquet.size());
       }
       this.paquet = this.test;
       return this.paquet;
   }
   
       
    public void Distribution(Joueur j1, Joueur j2) {
        ArrayList paquetJ1 = new ArrayList();
        ArrayList paquetJ2 = new ArrayList();
        int i; // taille du paquet     
        while (this.paquet.size() > 0) { 

            i = this.paquet.size() - 1;
            
            if (i%2 == 0) {
                paquetJ1.add(this.paquet.get(i));
                this.paquet.remove(i);
            }
            
            else {
                paquetJ2.add(this.paquet.get(i));
                this.paquet.remove(i);
            }
        }
        j1.setPaquet(paquetJ1);
        j2.setPaquet(paquetJ2);
    }
   
    // ########## accesseurs (optionnel) ##########
    
    // ########## mutateur (optionnel) ##########
    
}
