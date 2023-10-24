package Algorytmy.Sortowanie;

import java.util.Random;
import java.util.Stack;

public class QuickSort extends Sorting {
	private final InsertionSort insertionSort;
	private final Random random;

	public QuickSort() {
		insertionSort = new InsertionSort();
		random = new Random();
	}

	void qsort_r(double[] t, int p, int k) {
		if (k - p > 16) {
			int d = med(t, p, k, random.nextInt(p, k + 1));
			swap(t, p, d);
			int s = podziel(t, p, k);
			qsort_r(t, p, s - 1);
			qsort_r(t, s + 1, k);
		} else {
			insertionSort.insort(t, p - k - 1);
		}
	}

	//mediana
	private int med(double[] t, int p, int k, int i) {
		return 0;
	}

	private int podziel(double[] t, int p, int k) {
		int i = p, j = p;
		for (; i <= k; i++) {
			if (t[i] < t[p]) {
				swap(t, i, j + 1);
				j += 2;
			}
		}
		swap(t, p, j);
		return j;
	}

	private int xpodziel(double[] t, int p, int k) {
		int i = p + 1;
		int j = k;
		while (i < j) {
			while (i < j && t[i] < t[p]) {
				i++;
			}
			while (i < j && t[j] >= t[p]) {
				j--;
			}
			if (i < j) {
				swap(t, i, j);
			}
		}
		if (t[i] >= t[p]) {
			i--;
		}
		swap(t, i, p);
		return i;
	}

	public void qsortbr(double[] t, int n) {
		Stack<Integer> stos = new Stack<>();
		stos.push(0);
		stos.push(n - 1);
		while (!stos.isEmpty()) {
			int k = stos.pop();
			int p = stos.pop();
			int s = xpodziel(t, p, k);
			if (s - p > 1) {
				stos.push(p);
				stos.push(s - 1);
			}
			if (k - s > 1) {
				stos.push(s + 1);
				stos.push(k);
			}
		}
	}
}

