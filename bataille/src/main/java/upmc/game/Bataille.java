
package upmc.game;

import java.util.Scanner;
import java.util.*;

public class Bataille
{
  public static void main(String[] args)
  { 
      
      Message msg = new Message();
      msg.msgBienvenue();
      
      String choix = msg.choixMenu();
      
      if (choix.equals("3")){
          System.exit(0);
      }
      
      // Implementation des méthodes du TP2
      MenuPseudo lecture = new MenuPseudo();
      LecturePseudo lecturepseudo = lecture.ModeLecturePseudo();
      ArrayList<String> pseudos = lecturepseudo.lirePseudo();
      
      String name = pseudos.get(0);
      pseudos.remove(0);
      String name2;
      boolean mode2J = false;
      Joueur j1 = new Joueur(0, name);
      
      if (choix.equals("1")) {
          name2 = "ordinateur";
          mode2J = false;
      }
      
      else if (choix.equals("2")) {
          
          if (pseudos.isEmpty()){
              Scanner joi = new Scanner(System.in);
              System.out.println("############## Joueur2 - Veuillez entrer votre nom : ##############");
              name2 = joi.nextLine();
              mode2J = true;
          }
          else {
              name2 = pseudos.get(0);   
              pseudos.remove(0);
          }
      }
      else {
          name2 = null;
          System.out.println("La réponse entrée n'est pas valide, veuillez réessayer");
      }
    
      Joueur j2 = new Joueur(0, name2);
  
      

      Paquet tas = new Paquet();
      tas.melangePaquet();
      tas.Distribution(j1, j2);
      // System.out.println(j1.VoirPaquet(j1.getPaquet()));
      // System.out.println(j2.VoirPaquet(j2.getPaquet()));
      int z = 0;
      String menu;
      
      while (j1.getPaquet().size() > 0 || j2.getPaquet().size() > 0){
          
          // affichage du menu
          
            menu = Message.choixMenu2(j1.nom);
            Carte carteJ1 = null;
            Carte carteJ2 = null;
            
            // piochez une carte choisi
            if (menu.equals("1")){
                carteJ1 = j1.Pioche(z);
                System.out.println(j1.nom+" Vous avez tirez : ["+carteJ1+"]");
                
                // mode 2 joueurs
                if (mode2J == true && menu.equals("1")) {
                    menu = Message.choixMenu2(j2.nom);
                    
                    if (menu.equals("1")) {
                        
                    }
                    else if (menu.equals("2")) {
                        j1.tableauScore(j1, j2);
                    }
                    else if (menu.equals("3")) {
                        Message.finPartie();
                    }
                }
                carteJ2 = j2.Pioche(z);
                System.out.println(j2.nom+" Vous avez tirez : ["+carteJ2+"]");
            
                if (carteJ1.compare(carteJ2) == carteJ1) {
                    System.out.println(j1.nom+" remporte la mache");
                    j1.score++;
                }
                else if (carteJ1.compare(carteJ2) == carteJ2) {
                    System.out.println(j2.nom+" remporte la manche");
                    j2.score++;
                }
                else {
                    j1.score++;
                    j2.score++;
                    System.out.println("Egalité");
                }
                j1.getPaquet().remove(z);
                j2.getPaquet().remove(z);
                }
            else if (menu.equals("2")) {
                j1.tableauScore(j1, j2);
            }
            else if (menu.equals("3")) {
                Message.finPartie();
            }
      }
      System.out.println("########## Fin de la partie #########");
      System.out.println("##########################################################");
      System.out.println("########## "+j1.nom+" "+j1.score+" ##########");
      System.out.println("########## "+j2.nom+" "+j2.score+" ##########");
      System.out.println("##########################################################");      
      System.out.println("########## Le gagnant est : #########");
      System.out.println("########## "+j1.Gagnant(j1, j2)+"#########");
      
  }
}
