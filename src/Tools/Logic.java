/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author schia
 */
public class Logic implements Runnable{

    private static Player player;
    private static Dealer dealer;
    private static BufferedReader stdin;
    
    @Override
    public void run() {
        stdin = new BufferedReader(new InputStreamReader(System.in));
        
        Deck deck = new Deck();
        deck.shuffleDeck();
        
        System.out.println("Welcome to the Blackjack table!");
        
        player = new Player(deck.draw(),deck.draw());
        player.printTotal();
        
        dealer = new Dealer(deck.draw(),deck.draw());
        
        while(player.hit){
            if(player.sum<21){
                try {
                    if(stdin.readLine().equals("stay")){
                        player.setHit(false);
                    }else if(stdin.readLine().equals("hit")){
                        player.setHit(true);
                        player.draw(deck.draw());
                    }

                } catch (IOException ex) {
                    System.out.println("Invalid statement, will consider it a stay");
                    player.setHit(false);
                }
            }else if(player.sum == 21){
                System.out.println("You automatically Stay");
            }else{
                System.out.println("You Busted");
                printDefeatStatement();
            }
        }
        System.out.println("Okay, Dealer's turn.");
        dealer.printHidden();
        
        while(dealer.hit){
            if(dealer.sum < 18){
                dealer.setHit(true);
                System.out.println("Dealer chooses to hit");
                dealer.draw(deck.draw());
                dealer.printTotal();
                
            }else if(dealer.sum <=21){
                dealer.setHit(false);
            }else{
                System.out.println("Dealer busted");
                printVictoryStatement();
            }
            
        }
        
        dealer.printTotal();
        player.printTotal();
        
        if(dealer.getTotal() >= player.getTotal()){
            printDefeatStatement();
        }else
            printVictoryStatement();
        
    }
    
    void printVictoryStatement(){
        System.out.println("\nYOU WIN!!");
    }
    
    void printDefeatStatement(){
        System.out.println("\nDEALER WINS!!");
    }
    
}
