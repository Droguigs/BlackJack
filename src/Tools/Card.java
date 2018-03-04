/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

/**
 * This class creates a generic card with it's value a suit and a boolean face
 * suits are -> 1 = DIAMONDS; 2 = CLUBS; 3 = HEARTS; 4 = SPADES
 * @author schia
 */
public class Card {
    private int value;
    private int suit;
    boolean face = false;
    private String suitC;
    
    public Card(int value, int suit){
        this.value = value;
        this.suit  = suit;
        if (value> 10){
            face = true;
        }
        switch(suit){
            case 1:
                suitC = "\u2666";
            break;
            
            case 2:
                suitC = "\u2663";
            break;
            
            case 3:
                suitC = "\u2764";
            break;
            
            case 4:
                suitC = "\u2660";
            break;
        }
        
        
    }
    
    public String printCard(){
        if(!this.checkFace()){
            return this.getCardVallue() + suitC;
        }else{
            switch(this.getCardVallue()){
                        case 11:
                            return "A" + suitC;
                           
                        case 12:
                            return "J" + suitC;
                            
                        case 13:
                            return "Q" + suitC;
                            
                        case 14:
                            return "K" + suitC;
            }      
        }
        
        return "";
    }
    
    public int getCardVallue(){
        if(value < 11){
            return value;
        }else
            return 10;
    }
    
    public int getCardSuit(){
        return suit;
    }
    
    public boolean checkFace(){
        return face;
    }
    
}
