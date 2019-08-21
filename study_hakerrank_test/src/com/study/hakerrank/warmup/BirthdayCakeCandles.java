package com.study.hakerrank.warmup;

import java.io.IOException;

public class BirthdayCakeCandles {

	// Complete the birthdayCakeCandles function below.
	static int birthdayCakeCandles(int[] ar) {
		int result = 0;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < ar.length; i++) {
			if (max < ar[i]) {
				max = ar[i];
				result = 0;
			}
			if (max == ar[i])
				result++;
		}

		return result;
	}

	public static void main(String[] args) throws IOException {

		int[] arr = { 44, 53, 31, 27, 77, 60, 66, 77, 26, 36 };
		int result = birthdayCakeCandles(arr);
		System.out.println(result);
	}
}
