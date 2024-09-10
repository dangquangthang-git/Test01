package buoi2;

import java.time.chrono.MinguoChronology;

public class buoi3 {

/*	static void min(int arr[]) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}

		}

		System.out.println(min);

	}*/

	static int min1(int arr[]) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}

		}

		return min;

	}

	public static void main(String[] args) {
		int mang[] = { 12, 22, 1, 23, 34, 26 };
		/* min(mang);*/
		int min2=min1(mang);
		System.out.println(min2);

	}

}
