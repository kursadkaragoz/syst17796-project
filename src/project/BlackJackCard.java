/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author kursad
 */
public class BlackJackCard extends Card {

    public BlackJackCard(String string, int i) {
        super(string, i);
    }

    @Override
    public String toString() {
        return this.getSuit(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
