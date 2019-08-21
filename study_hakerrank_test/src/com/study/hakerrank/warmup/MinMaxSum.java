package com.study.hakerrank.warmup;

public class MinMaxSum {

	// Complete the miniMaxSum function below.
	static void miniMaxSum(int[] arr) {
		long max = Long.MIN_VALUE;
		long min = Long.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			long compareMax = sum(i, arr);
			long compareMin = sum(i, arr);

			if (max < compareMax)
				max = compareMax;
			if (min > compareMin)
				min = compareMin;

		}
		System.out.print(min);
		System.out.print(" ");
		System.out.print(max);
	}

	static long sum(int i, int[] arr) {
		long result = 0;

		for (int j = 0; j < arr.length; j++) {
			if (i != j)
				result += arr[j];
		}

		return result;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		miniMaxSum(arr);

	}
}
