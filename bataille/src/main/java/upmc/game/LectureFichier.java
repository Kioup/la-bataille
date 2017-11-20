
package upmc.game;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

public class LectureFichier implements LecturePseudo {

    public ArrayList<String> lirePseudo() {
        
        this.LectureFicMessageDebut();
        ArrayList ficPseudo = new ArrayList<String>();
        boolean verif = false;
        String path = this.CreerChemin();
        String NomFic = this.CheminFic(path);
        String fichier = "";
        File Fichier = new File(NomFic);
        while (verif == false){   
            System.out.println(NomFic);
            Fichier = new File(NomFic);
            if (Fichier.exists()){
                verif = true;
                ficPseudo = this.nomFic(NomFic, ficPseudo);
            }
            else {
                this.LectureFicMessageFin();
                NomFic = this.CheminFic(path);
            } 
        }
        return ficPseudo;
    }
    
    public void LectureFicMessageDebut(){
        System.out.println("############### Indiquer le nom du fichier sans l'extension : ##############");
        System.out.println("Au cas ou vous ne souhaitez pas en créer un, il existe un fichier pseudo.txt qui contient des pseudonymes par defaut");
        System.out.println("############## Pour l'utiliser, indiquer juste \"pseudo\" dans la console. ##############");
    }
    
    public void LectureFicMessageFin() {
        System.out.println("Le nom du fichier spécifié est incorrect ou n'existe pas !");
        System.out.println("############## Veuillez réessayer ##############");
    }
    
    public ArrayList<String> nomFic(String NomFic, ArrayList AL){
    try {
                FileReader monFichier = new FileReader(NomFic);
                BufferedReader tampon = new BufferedReader(monFichier);
                while (true) {
                        // Lit une ligne du fichier .txt
                        String ligne = tampon.readLine();
                        // Vérifie la fin de fichier
                        if (ligne == null) {
                            break;
                        }
                        //Ajoute la ligne à la ligne.
                        AL.add(ligne);
                } // Fin du while 
            } catch (IOException exception) {
                exception.printStackTrace();
            } finally {
                try {
                    FileReader monFichier = new FileReader(NomFic);
                    BufferedReader tampon = new BufferedReader(monFichier);
                    tampon.close();
                    monFichier.close();
                } catch (IOException exception1) {
                    exception1.printStackTrace();
                }              

            }  
        return AL;
    }
    
    public String CheminFic(String path){
        Scanner kl = new Scanner(System.in);
        String NomFic = path+"..\\"+kl.nextLine()+".txt";
        return NomFic;
    }
    
    public String CreerChemin(){
        File test = new File("test.txt");
        String path = test.getAbsolutePath().replace("test.txt","");
        return path;
    }
}
