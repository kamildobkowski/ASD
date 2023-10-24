package Algorytmy.Sortowanie;

public class HeapSort extends Sorting {
	private void heap_up(double[] t, int n) {
		int i = n;
		while (i > 0) {
			int p = (i - 1) / 2;
			if (t[p] >= t[i]) {
				return;
			} else {
				swap(t, i, p);
				i = p;
			}
		}
	}

	private void heap_down(double[] t, int n) {
		int i = 0;
		int c = 1;

		while (c < n) {
			if (c + 1 < n && t[c + 1] > t[c]) {
				c++;
			}
			if (t[i] >= t[c]) {
				return;
			} else {
				swap(t, i, c);
				i = c;
				c = 2 * i + 1;
			}
		}
	}

	public void heap_sort(double[] t, int n) {
		for (int i = 1; i < n; i++) {
			heap_up(t, i);
		}
		for (int i = n - 1; i > 0; i--) {
			swap(t, 0, i);
			heap_down(t, i);
		}
	}
}
