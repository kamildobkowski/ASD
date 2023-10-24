package Algorytmy.Sortowanie;

public abstract class Sorting {
	public void swap(double[] t, int a, int b) {
		double tmp = t[a];
		t[a] = t[b];
		t[b] = tmp;
	}
}
