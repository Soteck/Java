/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicis;


import java.util.InputMismatchException;
import java.util.Scanner;

/** Aquesta classe és un exemple de com llegir un sencer des del teclat.
 * Per utilitzar-lo als vostres programes, copiau el mètode llegirSencer complet 
 * i afferrau-lo abans del main del vostre programa.
 * Utilitzau-lo com faig al main d'aquest exemple.
 *
 * @author joan
 */
public class LlegirCadena {

    /**
     * Llegeix una cadena del teclat i la torna com a resultat. Aquest resultat
     * s'ha d'assignar a qualque variable o s'ha d'utilitzar en qualque
     * expressió Exemple d'utilització: String nom;
     * nom=Teclat.llegirCadena("Introdueixi el nom: ");
     *
     * @param prompt El missatge que volem mostrar a l'usuari per que sàpiga què
     * li estam demanant.
     * @return La cadena que ha teclejat l'usuari.
     */
    public String llegirCadena(String prompt) {
        boolean correcte = false;

        String cadena = "";

        //L'objecte teclat representa l'entrada de dades.
        Scanner teclat = new Scanner(System.in);

        //Llegeix un sencer del teclat. Si el que introdueix l'usuari no es pot 
        //convertir a sencer l'avisa de l'errada i torna a demanar el sencer.
        do {
            System.out.print(prompt);
            try {
                cadena = teclat.next();
                correcte = true;

            } catch (InputMismatchException e) {
                System.err.println("Cadena incorrecte.");
                teclat.next();
            }
        } while (correcte == false);
        return cadena;
    }
    
    public static void main(String[] args){
        LlegirCadena exemple=new LlegirCadena();
        String nom;
        nom=exemple.llegirCadena("Introdueixi el nom: ");
        System.out.println("Nom: "+nom);
    }
}