package Algorytmy.Wyszukiwanie;

public class BinarySort {
	int bs(double[] v, int n, double x) {
		int l = 0;
		int p = n-1;
		while(l<p) {
			int m = (l+p)/2;
			if(x>v[m])
				l=m+1;
			else if (x<v[m])
				p=m-1;
			else
				return m;
		}
		return -1;
	}
}
