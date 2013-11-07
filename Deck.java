import java.util.Random;
public class Deck {
	private Card[] cards = new Card[52];
	private Card card;
	private Rectangle r = new Rectangle(10,10,72,96)
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
	// public int deal(){
	// 	this.numberOfCards--;
	// }
	public void shuffle(){
		for (int i = 52; i>=1; i--) {
			int instant = mixItUp.nextInt(i);
			Card instantValue = cards[instant];
			cards[instant] = cards[i-1];
			cards[i-1] = instantValue;
		}
	}
	public void print(){
		for (int i = 0; i<cards.length; i++) {
			System.out.println(this.cards[i].name()+" "+this.cards[i].suit());
			System.out.println(cards[i].draw(g,10+(i*72),10,72,96);
		}
	}
}