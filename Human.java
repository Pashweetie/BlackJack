import java.awt.*;
import java.applet.*;
import java.awt.Graphics;
public class Human extends Player{
	private int totalCardValue;
	public Human(){
		cardValue();

	}
	public void cardValue() {
		for (int i =0;i<hand.getHand().length ; i++) {
			totalCardValue = totalCardValue + hand.getCard().number();
		}
	}
	public void setCard(Card card){
		hand.setCard(card);
	}
	public void paint(Graphics g) {
		hand.print(g,1);
		System.out.println("Human paint works");
	}
	public int getValue() {
		return totalCardValue;
	}
}