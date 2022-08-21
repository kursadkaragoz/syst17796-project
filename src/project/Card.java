/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

public abstract class Card {
    
    protected String suit;
    protected int value;

    public Card (String suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    public String getSuit () {
        return suit;
    }

    public void setSuit (String suit) {
        this.suit = suit;
    }

    public int getValue () {
        return value;
    }

    public void setValue (int value) {
        this.value = value;
    }

    @Override
    public abstract String toString();

}
