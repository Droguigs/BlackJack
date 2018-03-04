/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/*/*
import Tools.Dealer;
import Tools.Deck;
import Tools.Player;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/**/
import Tools.Logic;

/**
 *
 * @author schia
 */
public class Engine {
    
        
    public static void main(String args[]){
        
        Thread t = new Thread(new Logic());
        
        t.start();
        
        
        /*/*
        stdin = new BufferedReader(new InputStreamReader(System.in));
        
        Deck deck = new Deck();
        deck.shuffleDeck();
        
        System.out.println("Welcome to the Blackjack table!");
        
        player = new Player(deck.draw(),deck.draw());
        player.printTotal();
        
        dealer = new Dealer(deck.draw(),deck.draw());
        
        /**/
        
    }
}
