package cn.edu.chapter2.exercises;

public interface ISort {
	public void sort();
	public void exch(int i,int j);
	public void show();
	public boolean less(Comparable<?> x,Comparable<?> y);
}
