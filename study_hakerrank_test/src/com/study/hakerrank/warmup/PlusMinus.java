package com.study.hakerrank.warmup;

public class PlusMinus {

	// Complete the plusMinus function below.
	static void plusMinus(int[] arr) {

		int zero = 0;
		int positive = 0;
		int negative = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0)
				positive++;
			else if (arr[i] < 0)
				negative++;
			else
				zero++;
		}

		float a = 0f, b = 0f, c = 0f;

		a = (float) positive / arr.length;
		b = (float) negative / arr.length;
		c = (float) zero / arr.length;

		System.out.printf("%.6f \n", a);
		System.out.printf("%.6f \n", b);
		System.out.printf("%.6f \n", c);

	}

	public static void main(String[] args) {

		int[] arr = { -4, 3, -9, 0, 4, 1 };
		plusMinus(arr);

	}
}
