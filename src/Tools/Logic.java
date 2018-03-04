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
    private String input;
    private boolean flag = true;
    
    @Override
    public void run() {
        stdin = new BufferedReader(new InputStreamReader(System.in));
        
        Deck deck = new Deck();
        deck.shuffleDeck();
        
        System.out.println("Welcome to the Blackjack table!");
        
        player = new Player(deck.drawCard(),deck.drawCard());
        player.printTotal();
        
        dealer = new Dealer(deck.drawCard(),deck.drawCard());
        
        player.setHit(true);
        dealer.setHit(true);
        
        while(player.hit){
            System.out.println();
            System.out.printf("Would you like to 'hit' or 'stay'? ");
            if(player.sum<21){
                try {
                    input = stdin.readLine();
                    if(input.equals("stay")){
                        player.setHit(false);
                    }else if(input.equals("hit")){
                        player.setHit(true);
                        player.draw(deck.drawCard());
                        if(player.sum >21){
                            System.out.println("You Busted");
                            printDefeatStatement();
                            player.setHit(false);
                            flag = false;
                        }
                    }

                } catch (IOException ex) {
                    System.out.println("Invalid statement, will consider it a stay");
                    player.setHit(false);
                }
            }else if(player.sum == 21){
                System.out.println("You automatically Stay");
                player.setHit(false);
            }
        }
        if(flag){
            System.out.println();
            System.out.println("Okay, Dealer's turn.");
            dealer.printHidden();

            while(dealer.hit){
                if(dealer.sum < 18){
                    dealer.setHit(true);
                    System.out.println();
                    System.out.println("Dealer chooses to hit");
                    dealer.draw(deck.drawCard());
                    dealer.printTotal();
                    if(dealer.sum > 21){
                        System.out.println("Dealer busted");
                        printVictoryStatement();
                        dealer.setHit(false);
                        flag = false;
                    }

                }else if(dealer.sum <=21){
                    dealer.setHit(false);
                }

            }
            
            if(flag){
                System.out.println();
                dealer.printTotal();
                player.printTotal();

                if(dealer.getTotal() >= player.getTotal()){
                    printDefeatStatement();
                }else
                    printVictoryStatement();
            }

        }
        
    }
    
    void printVictoryStatement(){
        System.out.println("\nYOU WIN!!");
    }
    
    void printDefeatStatement(){
        System.out.println("\nDEALER WINS!!");
    }
    
}
