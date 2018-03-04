/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

import java.util.ArrayList;

/**
 *
 * @author schia
 */
public class Hand {
    int sum;
    ArrayList<Card> cards;
    
    public Hand(){
        cards = new ArrayList<Card>();
        sum = 0;
    }
    
    public void hit(Card card){
        cards.add(card);
    }
    
    public void printTotal(){
        System.out.println("Your total is" + sum);
    }
    
    public ArrayList<Card> resetHand(){
        ArrayList<Card> cards = new ArrayList<Card>();
        
        for(Card card: this.cards){
            cards.add(card);
        }
        
        this.cards.clear();
        
        return cards;
    }
    
}
