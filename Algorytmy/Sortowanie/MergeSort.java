package Algorytmy.Sortowanie;

public class MergeSort {
	private void mergeSort(double[] nums) {
		int n = nums.length;
		double[] tmp = new double[n];
		double[] s = nums;
		double[] d = tmp;

		int l = 2;
		while(l/2 < n) {
			for(int ss = 0; ss < n; ss+=l) {
				merge(s, d, ss, (Math.min(ss + l / 2, n)), (Math.min(ss + l, n)));
			}
			tmp = s;
			s = d;
			d = tmp;
			l*=2;
		}
		if(s != nums)
			System.arraycopy(nums, 0, s, 0, n);

	}
	private void merge(double[] s, double[] d, int ps, int ss, int ks) {
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

		while (i<ss) {
			d[k]=s[i];
			k++;
			i++;
		}
		while(j<ks) {
			d[k]=s[j];
			k++;
			j++;
		}
	}

}
