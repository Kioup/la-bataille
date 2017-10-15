// Copyright 2017 Pierre Talbot (IRCAM)

// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at

//     http://www.apache.org/licenses/LICENSE-2.0

// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package upmc.game;

import java.util.Scanner;
import java.util.*;

public class Bataille
{
  public static void main(String[] args)
  { 
      System.out.println("##################################################################");
      System.out.println("############ Bienvenu dans le jeu de la bataille ! ###############");
      System.out.println("##################################################################"+"\n");
      
      System.out.println("##### Choisissez un mode de jeu #####");
      System.out.println("(1) jouer contre l\'ordinateur || (2) Jouer contre un partenaire");
      Scanner md = new Scanner(System.in);
      String choix = md.nextLine();
      
      Scanner jou = new Scanner(System.in);
      System.out.println("Joueur 1 - Veuillez entrer votre nom : ");
      String name = jou.nextLine();
      String name2;
      boolean mode2J = false;
      Joueur j1 = new Joueur(0, name);
      
      if (choix.equals("1")) {
          name2 = "ordinateur";
          mode2J = false;
      }
      
      else if (choix.equals("2")) {
          Scanner joi = new Scanner(System.in);
          System.out.println("Joueur2 - Veuillez entrer votre nom : ");
          name2 = joi.nextLine();
          mode2J = true;
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
          
            System.out.println("##### "+j1.nom+" Choisissez une action #####");
            System.out.println("(1) Piocher une carte | (2) Afficher le Score | (3) Quitter");
            Scanner tl = new Scanner(System.in);
            menu = tl.nextLine();
            Carte carteJ1 = null;
            Carte carteJ2 = null;
            
            if (menu.equals("1")){
                carteJ1 = j1.Pioche(z);
                System.out.println("Vous avez tirez : ["+carteJ1+"]");
                
                // mode 2 joueurs
                if (mode2J == true && menu.equals("1")) {
                    System.out.println("##### "+j2.nom+" Choisissez une action #####");
                    System.out.println("(1) Piocher une carte | (2) Afficher le Score | (3) Quitter");
                    Scanner tm = new Scanner(System.in);
                    menu = tm.nextLine();
                    
                    if (menu.equals("1")) {
                        
                    }
                    
                    else if (menu.equals("2")) {
                        System.out.println("##########################################################");
                        System.out.println("########## "+j1.nom+" "+j1.score+" ##########");
                        System.out.println("########## "+j2.nom+" "+j2.score+" ##########");
                        System.out.println("##########################################################");
                    }
                    else if (menu.equals("3")) {
                        System.out.println("########## Fin de la partie #########");
                        System.exit(0);
                    }
                    else {
                        System.out.println(" ########## Vous n'avez pas entré le bon numero ##########");
                        System.out.println("########## Veuillez réessayer ##########");
                    }
                }
                carteJ2 = j2.Pioche(z);
                System.out.println("Vous avez tirez : ["+carteJ2+"]");
            
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
                System.out.println("##########################################################");
                System.out.println("########## "+j1.nom+" "+j1.score+" ##########");
                System.out.println("########## "+j2.nom+" "+j2.score+" ##########");
                System.out.println("##########################################################");
            }
            else if (menu.equals("3")) {
                System.out.println("########## Fin de la partie #########");
                System.exit(0);
            }
            else {
                System.out.println(" ########## Vous n'avez pas entré le bon numero ##########");
                System.out.println("########## Veuillez réessayer ##########");
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
