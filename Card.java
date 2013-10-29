public class Card  {
	int number;
	String suit;
	public Card(int cardNumber, String suit){
		if (cardNumber>10 && cardNumber !=11) {
			this.number = 10;
		}else{
			this.number = cardNumber;
		}
		this.suit = suit;
	}
	public int number(){
		return this.number;
	}
	public String suit(){
		return this.suit;
	}	
	public void setNumber(int number){
		this.number = number;
	}
	public void setSuit(String suit){
		this.suit = suit;
	}
}