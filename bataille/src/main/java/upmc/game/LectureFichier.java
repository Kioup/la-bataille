/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upmc.game;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author Kiril
 */
public class LectureFichier implements LecturePseudo {

    public ArrayList<String> lirePseudo() {
        
        FileReader monFichier = null;
        BufferedReader tampon = null;
        System.out.println("Indiquer le nom du fichier sans l'extension : ");
        Scanner kl = new Scanner(System.in);
        File test = new File("test.txt");
        String path = test.getAbsolutePath().replace("test.txt","");
        String NomFic = path+"..\\"+kl.nextLine()+".txt";
        ArrayList AL = new ArrayList<String>();
        boolean verif = false;
        
        String fichier = "";
        File Fichier = new File(NomFic);
        while (verif == false){   
            System.out.println(NomFic);
            Fichier = new File(NomFic);
            if (Fichier.exists()){
                verif = true;
                try {
                    monFichier = new FileReader(NomFic);
                        tampon = new BufferedReader(monFichier);
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
                            tampon.close();
                            monFichier.close();
                        } catch (IOException exception1) {
                            exception1.printStackTrace();
                        }              

                        }  
                    }
                else {
                    System.out.println("Le nom du fichier spécifié est incorrect ou n'existe pas !");
                    System.out.println("Veuillez réessayer");
                    NomFic = path+"..\\"+kl.nextLine() + ".txt";
                } 
        }
        return AL;
    }
}
