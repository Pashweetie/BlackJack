import java.util.Random;
import java.awt.*;
import java.applet.*;
import java.awt.Graphics;

public class Hand {
	private int cardNumber = 0;
	private Card[] hand = new Card[11];
	public Hand(){

	}
	public void setCard(Card card) {
		if (hand.length<11) {
			hand[cardNumber] = card;
			cardNumber++;
		}
		
	}
	public Card getCard() {
		return hand[cardNumber];
	}
	public Card[] getHand() {
		return hand;
	}
	public void print(Graphics g, int row) {
		System.out.println("This method should work-print Dealer.java");
		int y = 0;
		int x = 0;
		for (int i = 0; i<hand.length; i++) {
			if ((i%13)==0) {
				y++;
				x=0;
			}
			hand[i].draw(g,10+(x*72),10+(y*96*row),72,96);
			x++;
		}
		
	}
	public int cardNumber(){
		return cardNumber;
	}
}