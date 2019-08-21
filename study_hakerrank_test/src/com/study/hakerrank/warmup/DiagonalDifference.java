package com.study.hakerrank.warmup;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Result {

	/*
	 * Complete the 'diagonalDifference' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts
	 * 2D_INTEGER_ARRAY arr as parameter.
	 */

	public static int diagonalDifference(List<List<Integer>> arr) {
		// Write your code here
		int result1 = 0;
		int result2 = 0;

		for (int i = 0; i < arr.size(); i++) {
			List<Integer> row = arr.get(i);
			result1 = result1 + row.get(i).intValue();
			result2 = result2 + row.get(row.size() - i - 1).intValue();
		}

		return Math.abs(result1 - result2);
	}

}

public class DiagonalDifference {
	public static void main(String[] args) throws IOException {
		List<List<Integer>> arr = new ArrayList<List<Integer>>();

		List<Integer> row1 = new ArrayList<Integer>();
		row1.add(11);
		row1.add(2);
		row1.add(4);

		arr.add(row1);

		List<Integer> row2 = new ArrayList<Integer>();
		row2.add(4);
		row2.add(5);
		row2.add(6);

		arr.add(row2);

		List<Integer> row3 = new ArrayList<Integer>();
		row3.add(10);
		row3.add(8);
		row3.add(-12);

		arr.add(row3);

		int result = Result.diagonalDifference(arr);
		System.out.println(result);
	}
}
