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
    
    public Card(int value, int suit){
        this.value = value;
        this.suit  = suit;
        if (value> 10){
            face = true;
        }
    }
    
    public void printCard(){
        if(!this.checkFace()){
            switch(this.getCardSuit()){
                
                case 1:
                    System.out.println(this.getCardVallue() +"\u2666");
                break;
                    
                case 2:
                    System.out.println(this.getCardVallue() +"\u2663");
                break;
                    
                case 3:
                    System.out.println(this.getCardVallue() +"\u2764");
                break;
                    
                case 4:
                    System.out.println(this.getCardVallue() +"\u2660");
                break;
                    
            }
        }else{
            switch(this.getCardSuit()){

                case 1:
                    switch(this.getCardVallue()){
                        case 11:
                            System.out.println("A\u2666");
                        break;
                           
                        case 12:
                            System.out.println("J\u2666");
                        break;
                            
                        case 13:
                            System.out.println("Q\u2666");
                        break;
                            
                        case 14:
                            System.out.println("K\u2666");
                        break;
                    }
                break;

                case 2:
                    switch(this.getCardVallue()){
                        case 11:
                            System.out.println("A\u2663");
                        break;

                        case 12:
                            System.out.println("J\u2663");
                        break;

                        case 13:
                            System.out.println("Q\u2663");
                        break;

                        case 14:
                            System.out.println("K\u2663");
                        break;
                    }
                break;

                case 3:
                    switch(this.getCardVallue()){
                        case 11:
                            System.out.println("A\u2764");
                        break;
                            
                        case 12:
                            System.out.println("J\u2764");
                        break;
                            
                        case 13:
                            System.out.println("Q\u2764");
                        break;
                            
                        case 14:
                            System.out.println("K\u2764");
                        break;
                    }
                break;

                case 4:
                    switch(this.getCardVallue()){
                        case 11:
                            System.out.println("A\u2660");
                        break;
                            
                        case 12:
                            System.out.println("J\u2660");
                        break;
                            
                        case 13:
                            System.out.println("Q\u2660");
                        break;
                            
                        case 14:
                            System.out.println("K\u2660");
                        break;
                    }
                break;
            }
        }
    }
    
    public int getCardVallue(){
        return value;
    }
    
    public int getCardSuit(){
        return suit;
    }
    
    public boolean checkFace(){
        return face;
    }
    
}
