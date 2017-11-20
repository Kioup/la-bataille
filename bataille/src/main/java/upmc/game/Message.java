
package upmc.game;

import java.util.Scanner;
public class Message {
    
    public void msgBienvenue(){
      System.out.println("##################################################################");
      System.out.println("############ Bienvenu dans le jeu de la bataille ! ###############");
      System.out.println("##################################################################"+"\n");
    }
    
    public String choixMenu(){
      System.out.println("##### Choisissez un mode de jeu #####");
      System.out.println("(1) jouer contre l\'ordinateur || (2) Jouer contre un partenaire || (3) Arréter la partie en cour");
      Scanner md = new Scanner(System.in);
      String choix = md.nextLine();
      return choix;
    }
    
}
