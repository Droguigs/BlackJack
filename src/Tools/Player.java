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
public class Player extends Hand{
    
    public Player(Card card1, Card card2){
        super.draw(card1);
        super.draw(card2);
        
        System.out.println("You get a(n)"+ card1.printCard() +"and a(n)" + card2.printCard());    
    }
    
    @Override
    public void draw(Card card){
        super.draw(card);
        System.out.printf("You drew a(n)"+card.printCard());
        this.printTotal();
    }
    
    
    
}
