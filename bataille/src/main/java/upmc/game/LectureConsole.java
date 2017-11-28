package upmc.game;

import java.util.*;

public class LectureConsole implements LecturePseudo {
    public LectureConsole(){};
    /*public String readConsole() {
        Scanner lc = new Scanner(System.in);
        String pseudo = lc.nextLine();
        return pseudo;
    }*/
    public ArrayList<String> lirePseudo() {
        System.out.println("############## Joueur 1 - Veuillez entrer votre pseudo : ##############");
        Scanner lc = new Scanner(System.in);
        ArrayList AL = new ArrayList<String>();
        String pseudo = lc.nextLine();
        AL.add(pseudo);
        return AL;
    }

}
