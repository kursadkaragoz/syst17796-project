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
public class Deck extends GroupOfCards {
    
    int [] Value ={1,2,3,4,5,6,7,8,9,10};
    String [] Suit = {"DIAMONDS", "SPADES", "CLUBS", "HEARTS", "ACE"};
    public Deck(int size) {
        super(size);
        
        for (int i = 0; i < Suit.length; i++) {
            for (int j = 0; j < Value.length; j++) {
                cards.add(new BlackJackCard(Suit[i], Value[j]));
            }
        }
        //Shuffle the deck
        shuffle();
    }
    }
    

