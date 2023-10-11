package Algorytmy.Sortowanie;

public class InsertionSort {
	void insort(double[] v, int n) {
		for(int i = 1; i<n; i++) {
			double tmp = v[i];
			int j = i;
			for(; j>0 && v[j-1]>tmp; j--) {
				v[j] = v[j-1];
			}
			v[j] = tmp;
		}
	}
}
