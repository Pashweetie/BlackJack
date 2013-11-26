import java.awt.*;
import java.applet.*;	
public class Tester extends Applet{
	Dealer dealer;
	Deck deck;
	// Human human;
	public void init(){
		dealer = new Dealer();
		deck = new Deck();
		// human = new Human();
		dealer.run();
	}
	public void paint(Graphics g){
		dealer.print(g);
		deck.print(g);
	}
}