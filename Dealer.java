import java.awt.*;
import java.applet.*;
import java.awt.Graphics;
public class Dealer extends Player{
	private Deck deck = new Deck();
	private int totalCardValue = 0;
	public Dealer(){

	}
	public void hit(Player player){
		player.setCard(deck.getCard(cardsDrawn));
		cardsDrawn++;
	}
	// public void hitPlayer(){
	// 	human.setHand(deck.getCard(cardsDrawn));

	// }
	public void run(){
		int totalCardValue = 0;
		while (totalCardValue<21) {
			if (hand.getHand().length<11) {
				hand.setCard(deck.getCard(cardsDrawn));
				cardsDrawn++;
				totalCardValue = totalCardValue + hand.getCard().number();
			}		 
		}
	}
	
	public void setCard(Card card){
		hand.setCard(card);
	}
	public void print(Graphics g) {
		hand.print(g,3);
		System.out.println("Dealer paint works");
	}
	public int getValue() {
		return totalCardValue;
	}
}