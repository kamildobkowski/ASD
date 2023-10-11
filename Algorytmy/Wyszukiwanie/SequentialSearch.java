package Algorytmy.Wyszukiwanie;

public class SequentialSearch {
	public int ss(double[] v, int n, double x) {
		for(int i = 0; i<n; i++) {
			if(v[i] == x) {
				return i;
			}
		}
		return -1;
	}
}
