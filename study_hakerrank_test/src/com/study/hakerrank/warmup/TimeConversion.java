package com.study.hakerrank.warmup;

import java.io.IOException;

public class TimeConversion {

	/*
	 * Complete the timeConversion function below.
	 */
	static String timeConversion(String s) {
		/*
		 * Write your code here.
		 */

		String result = s.substring(0, s.length() - 2);

		String time = s.substring(s.length() - 2, s.length());
		if (time.equalsIgnoreCase("PM")) {
			if (result.substring(0, 2).equals("12"))
				return result;
			else
				result = (Integer.valueOf(result.substring(0, 2)) + 12) + result.substring(2, result.length());
		} else {
			if (result.substring(0, 2).equals("12"))
				result = "00" + result.substring(2, result.length());

		}

		return result;

	}

	public static void main(String[] args) throws IOException {

		String result = timeConversion("12:45:54PM");
		System.out.println(result);
	}
}
