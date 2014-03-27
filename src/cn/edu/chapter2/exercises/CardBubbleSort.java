package cn.edu.chapter2.exercises;

import edu.princeton.cs.introcs.StdOut;

public class CardBubbleSort implements ISort {
	
	private static Card[] a;
	private static final int CARDS_SIZE = 52;
	public CardBubbleSort(){
		a = new Card[CARDS_SIZE];
		initCards();
		shuffle();
	}
	private  void initCards(){
		int i = 0;
			for(CardColor cc: CardColor.values()){
				for(CardNum cn : CardNum.values()){
					a[i++] = new Card(cc,cn);
				}
			}
	}
	private  void shuffle(){
		for(int i = 0;i<a.length-1;i++){
			int rand = (int) (Math.random()*(a.length-(i+1)))+(i+1);
			exch(a,i,rand);
		}
	}
	@Override
	public void sort(Comparable<?>[] a) {
		for(int i = 0; i < a.length;i++){
			for(int j = 1;j < a.length-i;j++){
				if(less(a[j],a[j-1])){
					Comparable<?> t = a[j];
					a[j] = a[j-1];
					a[j-1] = t;
				}
			}
		}
	}
	public void sort(){
		sort(CardBubbleSort.a);
	}
	@Override
	public void exch(Comparable<?>[] a, int i, int j) {
		if(i == j)return;
		Comparable<?> t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	public void exch(int i,int j){
		exch(CardBubbleSort.a,i,j);
	}
	@Override
	public void show(Comparable<?>[] a) {
		int count = 0;
		for(Object obj : a){
			if(obj instanceof Card){
				Card c = (Card) obj;
				StdOut.print(c+" ");
				if(0 == ++count % CardNum.values().length){
					StdOut.println();
				}
			}
		}
	}
	public void show(){
		show(CardBubbleSort.a);
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
	public boolean less(int i,int j){
		return less(CardBubbleSort.a[i],CardBubbleSort.a[j]);
	}
}
