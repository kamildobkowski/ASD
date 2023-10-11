package Algorytmy.Sortowanie;

public class MergeSort {
	public void mergeSort(double[] v, int n) {
		double [] tmp = new double[n];
		double [] s = v;
		double [] d = tmp;

		int l = 2;
		while(l/2 < n) {
			for(int ss = 0; ss < n; ss+=l) {
				merge(s, d, ss, (ss+l/2 > n ? n : ss+1), (ss+l > n ? n : ss+1));
			}
			tmp = s;
			s = d;
			d = tmp;
			l*=2;
		}
		if(s != v) {
			System.arraycopy(v, 0, s, 0, n);
			s = null;
		}
		else {
			d = null;
		}
	}

	private void merge(double []s, double []d, int ps, int ss, int ks) {
		int i = ps;
		int j = ss;
		int k = ps;

		while(i<ss && j<ks) {
			if(s[i] <= s[j]) {
				d[k++] = s[i++];
			}
			else {
				d[k++] = s[j++];
			}
		}
		while(i<ss) {
			d[k++] = s[i++];
		}
		while(j<ks) {
			d[k++] = s[j++];
		}
	}
}
