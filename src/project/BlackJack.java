/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author kursad
 */
public class BlackJack extends Game {
    
    GroupOfCards dealerCards = new GroupOfCards(52);
    GroupOfCards playerCards = new GroupOfCards(52);
    
    Dealer dealer = new Dealer("Dealer");
    BlackJackPlayer player = new BlackJackPlayer("Player");
    
    Deck deck = new Deck(52);
    Random rand = new Random();
    
    String anotherCard;


    public BlackJack(String name) {
        super(name);
    }
    
    @Override
    public void play() {
        
        
        Scanner in = new Scanner(System.in);
        
        int dealerCard1= deck.cards.remove((int) (Math.random() * deck.cards.size() + 1)).getValue();
        int dealerCard2= deck.cards.remove((int) (Math.random() * deck.cards.size() + 1)).getValue();
        int dealerTotal = dealerCard1 + dealerCard2;
        int playerCard1= deck.cards.remove((int) (Math.random() * deck.cards.size() + 1)).getValue();
        int playerCard2= deck.cards.remove((int) (Math.random() * deck.cards.size() + 1)).getValue();
        int playerTotal = playerCard1+ playerCard2;
        
        System.out.println("Dealer cards: "+dealerCard1 +", " +dealerCard2);
        System.out.println("Dealer total: "+dealerTotal+"\n");
        System.out.println("Player cards: "+playerCard1 +", " +playerCard2);
        System.out.println("Player total: "+playerTotal+"\n");
        
        System.out.print("Another Card (y/n)?: ");
        anotherCard = in.nextLine();
         
         while (anotherCard.equalsIgnoreCase("y"))
            {
                int next = deck.cards.remove((int) (Math.random() * deck.cards.size() + 1)).getValue();
                playerTotal+=next;
                System.out.println("\nPlayer Card: " + next);
                System.out.println("Player total: " + playerTotal);
                
                if (playerTotal == 21) {
                    declareWinner("player");
                    System.exit(0);
                }
                
                if (playerTotal > 21) {
                    declareWinner("dealer");
                    System.exit(0);
                }
                
                if (playerTotal < 21) {
                System.out.print("Another Card (y/n)?: ");
                anotherCard = in.nextLine();
                }
            }
         
         while (dealerTotal < 18) {
            int next = deck.cards.remove((int) (Math.random() * deck.cards.size() + 1)).getValue();
            dealerTotal+=next;
            
            System.out.println("\nDealer Card: " + next);
            System.out.println("Dealer total: " + dealerTotal);
            
            if (dealerTotal > 21) {
                declareWinner("player");
                System.exit(0);
            }
         }
         
         if (playerTotal > dealerTotal) {
             declareWinner("player");
         }
         
         else if (playerTotal < dealerTotal) {
             declareWinner("dealer");
         }
         
         else if (playerTotal == dealerTotal) {
             System.out.println("Draw! No Winner");
         }

    }

    
    public void declareWinner(String winner) {
        if (winner.equals("player")) {
            System.out.println("Dealer Busts, You Win!");

        }
        
        else if (winner.equals("dealer")) {
            System.out.println("You busted, Dealer Wins");
        }
    }
    
    public void run() {
        play();
    }
}
