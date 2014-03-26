package cn.edu.chapter2.exercises;

import edu.princeton.cs.introcs.StdOut;

public class CardBubbleSort implements ISort {
	
	private static Card[] a;
	private static final int CARDS_SIZE = 52;
	public CardBubbleSort(){
		initCards();
		shuffle();
	}
	private  void initCards(){
		a = new Card[CARDS_SIZE];
		int i = 0;
			for(CardColor cc: CardColor.values()){
				for(CardNum cn : CardNum.values()){
					a[i].setColor(cc);
					a[i++].setNum(cn);
				}
			}
	}
	private  void shuffle(){
		for(int i = 0;i<a.length;i++){
			int rand = (int) (Math.random()*(a.length-(i+1)))+(i+1);
			exch(a,i,rand);
		}
	}
	@Override
	public void sort(Comparable<?>[] a) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exch(Comparable<?>[] a, int i, int j) {
		if(i == j)return;
		Comparable<?> t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	public void exch(int i,int j){
		exch(this.a,i,j);
	}
	@Override
	public void show(Comparable<?>[] a) {
		int count = 0;
		for(Object obj : a){
			if(obj instanceof Card){
				Card c = (Card) obj;
				StdOut.print(c);
				StdOut.print(" ");
				if(0 == ++count % CardNum.values().length){
					StdOut.println();
				}
			}
		}
	}
	public void show(){
		show(this.a);
	}
	@Override
	public boolean less(Comparable<?> x, Comparable<?> y) {
		if(x instanceof Card && y instanceof Card){
			Card tempX = (Card) x;
			Card tempY = (Card) y;
			if(tempX.compareTo(tempY) >= 0)return false;
			return true;
		}
		return false;
	}
}
