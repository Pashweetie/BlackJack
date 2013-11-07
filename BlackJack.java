import java.awt.*;
import java.applet.*;
public class BlackJack {
	
	public static void main(String[] args) {
		Graphics g;
		Card card = new Card("A", 11, "Hearts");
		Deck deck = new Deck();
		Rectangle rectangle = new Rectangle(10,10,69,94);
		card.draw(g,rectangle);
	}
}