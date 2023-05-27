package exercise1;

import java.util.Scanner;
import java.util.Objects;
/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Mayank
 * @author Mayank Raj May 26, 2023 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue((int)(Math.random()*12+1));           
            card.setSuit(Card.SUITS[(int)(Math.random()*3+1)]);
            hand[i]=card;
        }
        Scanner input = new Scanner(System.in);
        while (true){
            Card temp = new Card();
            System.out.println("Enter your card Number, 11->Jack, 12->Queen, : ");
            temp.setValue(Integer.parseInt(input.nextLine()));
            System.out.println("Enter your suit: ");
            temp.setSuit(Card.SUITS[Integer.parseInt(input.nextLine())]);
            for (Card c1: hand){
                if (Objects.equals(temp.getSuit(), c1.getSuit()) &&temp.getValue()==c1.getValue()){
                    printInfo();
                    break;
                }
            }
        }        
    }

    /**
     * @author Mayank Raj May 2022
     */
    //I'am Done!!
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Mayank, but you can call me prof, Paul or sir");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
        
    
    }

}
