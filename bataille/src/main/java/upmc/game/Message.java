package upmc.game;

import java.util.Scanner;
public class Message {
    
    public static void msgBienvenue(){
      System.out.println("##################################################################");
      System.out.println("############ Bienvenu dans le jeu de la bataille ! ###############");
      System.out.println("##################################################################"+"\n");
    }
    
    public static String choixMenu(){
      System.out.println("##### Choisissez un mode de jeu #####");
      System.out.println("(1) jouer contre l\'ordinateur || (2) Jouer contre un partenaire || (3) Arréter la partie en cour");
      Scanner md = new Scanner(System.in);
      String choix = md.nextLine();
      while((!choix.equals("1")) && (!choix.equals("2")) && (!choix.equals("3"))){
            System.out.println(" ########## Vous n'avez pas entré le bon numero ##########");
            System.out.println("########## Veuillez réessayer ##########");
            System.out.println("##### Choisissez un mode de jeu #####");
            System.out.println("(1) jouer contre l\'ordinateur || (2) Jouer contre un partenaire || (3) Arréter la partie en cour");
            md = new Scanner(System.in);
            choix = md.nextLine();
        }
      return choix;
    }
    
    public static String choixMenu2(String joueurNom){
        System.out.println("##### "+joueurNom+" Choisissez une action #####");
        System.out.println("(1) Piocher une carte | (2) Afficher le Score | (3) Quitter");
        Scanner tl = new Scanner(System.in);
        String menu = tl.nextLine();
        while((!menu.equals("1")) && (!menu.equals("2")) && (!menu.equals("3"))){
            System.out.println(" ########## Vous n'avez pas entré le bon numero ##########");
            System.out.println("########## Veuillez réessayer ##########");
            System.out.println("##### "+joueurNom+" Choisissez une action #####");
            System.out.println("(1) Piocher une carte | (2) Afficher le Score | (3) Quitter");
            tl = new Scanner(System.in);
            menu = tl.nextLine();
        }
        return menu;
    }
    
    public static void finPartie(){
            System.out.println("########## Fin de la partie #########");
            System.exit(0);
    }
    
    public void finPartie(Joueur j1, Joueur j2){ 
      System.out.println("########## Fin de la partie #########");
      System.out.println("##########################################################");
      System.out.println("########## "+j1.nom+" "+j1.score+" ##########");
      System.out.println("########## "+j2.nom+" "+j2.score+" ##########");
      System.out.println("##########################################################");      
      System.out.println("########## Le gagnant est : #########");
      System.out.println("########## "+j1.Gagnant(j1, j2)+"#########"); 
    }
    
}
