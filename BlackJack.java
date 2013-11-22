import java.awt.*;
import java.applet.*;

import java.awt.event.*;
import javax.swing.*;

public class BlackJack extends Applet implements ActionListener {
	private JLabel label;
	private JButton add, stay;
	private Boolean gameOver = false;
	private Boolean playerWon = false;
	String title2;
	Dealer dealer;
	Human human;			
	public void init() {
		dealer = new Dealer();
		human = new Human();
		String title = "add";
		add = new JButton(title);
		add.setActionCommand(title);
		add.addActionListener(this);
		this.add(add);

		title2 = "stay";
		stay = new JButton(title);
		stay.setActionCommand(title);
		stay.addActionListener(this);
		this.add(stay);

		System.out.println("BlackJack init is running");
	}
	public void main(String[] args) {
		if (gameOver) {
			if (human.getValue()>dealer.getValue() && human.getValue()<=21) {
				playerWon= true;
			}
		}
		if (playerWon) {
			
		}
	}
	public void actionPerformed(ActionEvent ae) {
		if("stay".equals(ae.getActionCommand())){
			gameOver=true;
		} else if ("add".equals(ae.getActionCommand())) {
			dealer.hit(human);
			repaint();
		}
	}
	public void paint(Graphics g) {			
		dealer.print(g);
		human.paint(g);
	}
}