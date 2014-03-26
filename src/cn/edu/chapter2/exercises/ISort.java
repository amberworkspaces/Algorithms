package cn.edu.chapter2.exercises;

public interface ISort {
	public void sort(Comparable<?>[] a);
	public void exch(Comparable<?>[] a,int i,int j);
	public void show(Comparable<?>[] a);
	public boolean less(Comparable<?> x,Comparable<?> y);
}
