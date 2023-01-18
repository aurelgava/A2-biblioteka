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
public class AutorDO {
    public int ID;
    public String ime,prezime;

    public AutorDO(int ID, String ime, String prezime) {
        this.ID = ID;
        this.ime = ime;
        this.prezime = prezime;
    }

    @Override
    public String toString() {
        return ime + " " + prezime;
    }
    
}
