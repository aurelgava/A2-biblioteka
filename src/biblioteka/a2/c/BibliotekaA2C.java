/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteka.a2.c;

/**
 *
 * @author Korisnik
 */
public class BibliotekaA2C {
    public static final String URL_BAZE = "jdbc:ucanaccess://src\\resursi\\Skolska biblioteka.accdb";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new GlavniProzor().setVisible(true);
    }
    
}
