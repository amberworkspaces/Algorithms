package cn.edu.chapter2.exercises;

/**
 * define a playing cards data structure
 * 
 * @author Administrator
 *
 */
public class Card implements Comparable<Card> {
	private CardColor color;
	private CardNum num;
	
	public Card(){
		this(null,null);
	}
	public Card(CardColor color,CardNum num){
		this.color = color;
		this.num = num;
	}
	@Override
	public int compareTo(Card that) {
		if (0 != this.getColor().compareTo(that.getColor()))
			return this.getColor().compareTo(that.getColor());
		return this.getNum().compareTo(that.getNum());
	}
	
	
	@Override
	public String toString() {
		return  this.getColor() +""+ this.getNum();
	}


	public CardColor getColor() {
		return color;
	}

	public void setColor(CardColor color) {
		this.color = color;
	}

	public CardNum getNum() {
		return num;
	}

	public void setNum(CardNum num) {
		this.num = num;
	}

}
