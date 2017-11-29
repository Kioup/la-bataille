
package upmc.game;
import java.util.*;

public class MenuPseudo {
    
    public LecturePseudo ModeLecturePseudo(){
        
        Scanner gt = new Scanner(System.in);
        System.out.println("Voulez vous lire les pseudo via la console ou via un fichier texte ?");
        System.out.println("(1) via la console || (2) via un fichier .txt choisi || (3) quitter la partie");
        String descision = gt.nextLine();
        LecturePseudo test = null;
        if (descision.equals("1")){
                        test = new LectureConsole();
                        System.out.println("Vous avez choisi de lire les pseudo via la console. \n Dans ce cas vous devrez les insérer manuellement. \n ");
        }
        else if (descision.equals("2")){
                        test = new LectureFichier();
                        System.out.println("Vous avez choisi de lire les pseudo via un fichier texte. \n Dans ce cas vous devrez rentrer le nom d'un fichier texte en .txt existant. \n Il n'est pas nécéssaire de rentrer l'extension.\n");
        }
        else if (descision.equals("3")){
            System.exit(0);
        }
        else {
           System.out.println("Vous n'avez pas entrez de réponse valide \n Veuillez réessayer");      
        }
        
        return test;
    }
    
}
