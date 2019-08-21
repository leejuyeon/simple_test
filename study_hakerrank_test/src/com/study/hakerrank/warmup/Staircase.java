package com.study.hakerrank.warmup;

public class Staircase {

	// Complete the staircase function below.
	static void staircase(int n) {
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < (n - i - 1); j++) {
				System.out.print(" ");
			}

			String result = "";
			for (int j = 0; j < (i + 1); j++) {
				result += "#";
			}

			System.out.println(result);
		}
	}

	public static void main(String[] args) {
		staircase(5);
	}
}
