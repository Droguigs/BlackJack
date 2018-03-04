/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private static final int DECK_SIZE = 52;
    ArrayList<Card> deck = new ArrayList<Card>();
    
    ArrayList<Card> discard = new ArrayList<Card>();
    
    public Deck(){
        // Diamonds
        for(int i = 0; i< DECK_SIZE/4; i++){
            deck.add(new Card(i+2,1));
        }
        // Clubs
        for(int i = 0; i< DECK_SIZE/4; i++){
            deck.add(new Card(i+2,2));
        }
        // Hearts
        for(int i = 0; i< DECK_SIZE/4; i++){
            deck.add(new Card(i+2,3));
        }
        // Spades
        for(int i = 0; i< DECK_SIZE/4; i++){
            deck.add(new Card(i+2,4));
        }
    }
    
    public void shuffleDeck(){
        Collections.shuffle(deck);
    }
    
    public Card drawCard(){
        Card helper;
        if(!deck.isEmpty()){
            helper = deck.get(0);
            deck.remove(0);

            return helper;
        }else{
            for(int i = 0; i< DECK_SIZE; i++){
                helper = discard.get(0);
                deck.add(helper);
                discard.remove(0);
            }
        }
        
        helper = deck.get(0);
        deck.remove(0);

        return helper;
    }
    
    public void discard(Card card){
        discard.add(card);
    }    
    
    public void printDeck(){
        for(Card card : deck){
            card.printCard();
        }
    }
    
}
