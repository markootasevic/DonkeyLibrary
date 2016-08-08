/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marko
 */
public class Player {
    String name;
    String donkeyLetters;

    public Player(String name, String donkeyLetters) {
        this.name = name;
        this.donkeyLetters = donkeyLetters;
    }

    public Player() {
    }
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDonkeyLetters() {
        return donkeyLetters;
    }

    public void setDonkeyLetters(String donkeyLetters) {
        this.donkeyLetters = donkeyLetters;
    }
   
    
    
}
