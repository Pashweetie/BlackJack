import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NumberPanel extends JPanel implements ActionListener, MouseListener {
	

	private int value = 0;

	public NumberPanel() {
		super();

		label = new JLabel(value+"");
		label.setFont(new Font("sansserif", Font.BOLD, 32));
		this.add(label);


		this.addMouseListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		if("+1".equals(ae.getActionCommand())){
			value++;
			label.setText(value+"");
			repaint();
		}else if ("-1".equals(ae.getActionCommand())) {
			value --;
			label.setText(value+"");
			repaint();
		}
	}
public class BlackJack extends Applet implements ActionListener {
	private JLabel label;
	private JButton add, stay;
	private Boolean gameOver = false;
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

		title = "stay";
		stay = new JButton(title);
		stay.setActionCommand(title);
		stay.addActionListener(this);
		this.add(stay);

		System.out.println("BlackJack init is running");
	}
	public void actionPerformed(ActionEvent ae) {
		if("stay".equals(ae.getActionCommand())){
			gameOver=true;
		}
	}
	public void paint(Graphics g) {			
		dealer.paint(g);
		human.paint(g);
	}
}