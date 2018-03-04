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
    Card aux;
    boolean hit = true;
    int sum;
    ArrayList<Card> cards;
    
    public Hand(){
        cards = new ArrayList<Card>();
        sum = 0;
    }
    
    public void draw(Card card){
        cards.add(card);
        sum += card.getCardVallue();
        aux = card;
    }
    
    public void printTotal(){
        System.out.println("Your total is " + sum);
    }
    
    public Card resetHand(){
        Card card;
        if(!cards.isEmpty()){
            card = cards.get(0);
            return card;
        }
        
        return null;
    }
    
    public int getTotal(){
        return sum;
    }
    
    public void setHit(boolean b){
        hit = b;
    }
}
