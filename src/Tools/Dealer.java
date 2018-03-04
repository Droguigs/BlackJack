/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

/**
 *
 * @author schia
 */
public class Dealer extends Hand{
    
    public Dealer(Card card1, Card card2){
        super.draw(card1);
        super.draw(card2);
        
        aux = card1;
        
        System.out.println("The Dealer has a(n) "+ aux.printCard() +" showing, and a hidden card");
        System.out.println("Her total is hidden too");
        
        aux = card2;
        
    }
    
    @Override
    public void draw(Card card){
        super.draw(card);
        aux = card;
        System.out.println("She drew a(n) " + aux.printCard());
    }
    
    public void printHidden(){
        System.out.println("Her hidden card was a(n) " + aux.printCard());
        System.out.println("Her total was " + sum);
    }
    
    @Override
    public void printTotal(){
        System.out.println("Her total is " + sum);
    }
    
}
