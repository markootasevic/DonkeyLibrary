
import sun.applet.Main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marko
 */
public class Card {
    public enum Znak {
        pik,
        tref,
        karo,
        herc
    }
    Znak znak;
    int broj;

    public Card() {
    }

    public Card(Znak znak, int broj) {
        this.znak = znak;
        this.broj = broj;
    }
    
    public Znak getZnak() {
        return znak;
    }
    
    public void setZnak(Znak znak) {
        this.znak = znak;
    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }
    
    public boolean isTwoOfClubs () {
        if(this.broj == 2 && this.znak == Znak.pik) {
            return true;
        }
        return false;
    }
    
    
    
}
