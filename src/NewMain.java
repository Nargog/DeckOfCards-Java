/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mats
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DeckOfCards myCards = new DeckOfCards();
        
      
        
        System.out.print(myCards.cards[0].name + "\n");
        System.out.print(myCards.cards[1].name + "\n");
        System.out.print(myCards.cards[2].name + "\n");
        
        myCards.shuffleDeck();
      
      
        System.out.print(myCards.cards[0].name + "\n");
        System.out.print(myCards.cards[1].name + "\n");
        System.out.print(myCards.cards[2].name + "\n");
        

     System.out.print(myCards.drawCardFromtop().name);
        System.out.print(myCards.drawCardFromtop().name);
        System.out.print(myCards.drawCardFromtop().name);
        System.out.print(myCards.drawCardFromtop().name);
   
   
   
   //System.out.print(myDeckOfCards.drawCardFromtop().name);

        
    }
    
}
