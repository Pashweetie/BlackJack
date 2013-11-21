import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Card  {	
	private String name;
	private int number;
	private String suit;
	private Image image;
	private Graphics g;
	public Card(String name,int number, String suit){
		this.number = number;
		this.name = name;
		this.suit = suit;
		this.image = loadImage();
	}
	public int number(){
		return this.number;
	}
	public String suit(){
		return this.suit;
	}	
	public String name(){
		return this.name;
	}
	public void setNumber(int number){
		this.number = number;
	}
	public void setSuit(String suit){
		this.suit = suit;
	}
	public Image loadImage(){
		String path = null;
		try{
			path = "cards" + File.separator + name + suit + ".png";
			image = ImageIO.read(new File(path));
		}catch(IOException e){
			System.out.println("Could not load image at path:" +path);
			System.exit(1);
		}
		return image;
	}
	public void draw(Graphics g,int x, int y, int width, int height) {
		g.drawImage(image, x, y, width, height, null);
		System.out.println("Cards drawing function works");
	}
	// public class MoviePoster {

	// 	private String name;
	// 	private Image image;

	// 	public MoviePoster(String name) {
	// 		this.name = name;
	// 		this.image = MoviePoster.loadImage(name);
	// 	}
	// 	public void Draw(Graphics g, Rectangle r) {
	// 		g.drawImage(image, r.x, r.y, r.width, r.height, null);
	// 	}
	// 	private static Image loadImage(String name) {
	// 		String path = null;
	// 		Image image = null;

	// 		try{
	// 			path = "images" + File.separator + name + ".jpg";
	// 			// path = "images/awegaeee.jpg";
	// 			image = ImageIO.read(new File(path));
	// 		}catch(IOException e){
	// 			System.out.println("Could not load image at path:" +path);
	// 			System.exit(1);
	// 		}

	// 		return image;

	// 	}
	// }
}