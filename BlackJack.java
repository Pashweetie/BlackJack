import java.awt.*;
import java.applet.*;
import java.awt.Graphics;
public class BlackJack extends Applet {
	Dealer dealer;
	Human human;
	Buttons buttons; 		
	public void init() {
		dealer = new Dealer();
		human = new Human();
		buttons = new Buttons();
		System.out.println("BlackJack init is running");
	}
	public void paint(Graphics g) {			
		dealer.paint(g);
		human.paint(g);
	}
}