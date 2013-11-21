import java.util.Random;
import java.awt.*;
import java.applet.*;
import java.awt.Graphics;
public class Deck {
	private Card[] cards = new Card[52];
	private Card card;
	private String[] names = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
	private int[] values  = {2,3,4,5,6,7,8,9,10,10,10,10,11};
	private String[] suit = {"Hearts", "Spades", "Diamonds", "Clubs"};
	private Random mixItUp = new Random();
	private int indexCounter=0;
	public Deck(){
		while (indexCounter<52) {
			for (int i=0; i<13; i++) {
				for (int b = 0; b<4; b++ ) {
					card = new Card(names[i],values[i],suit[b]);
					indexCounter++;
					cards[indexCounter-1] = card;
				}
			}		
		}	
	}
	public void shuffle(){
		for (int i = 52; i>=1; i--) {
			int instant = mixItUp.nextInt(i);
			Card instantValue = cards[instant];
			cards[instant] = cards[i-1];
			cards[i-1] = instantValue;
		}
	}
	// public void print(Graphics g){
	// 	int y = 0;
	// 	int x = 0;
	// 	for (int i = 0; i<cards.length; i++) {
	// 		if ((i%13)==0) {
	// 			y++;
	// 			x=0;
	// 		}
	// 		cards[i].draw(g,10+(x*72),10+(y*96),72,96);
	// 		x++;
	// 	}
	// }
	public Card getCard(int count) {
		return cards[count];
	}
}