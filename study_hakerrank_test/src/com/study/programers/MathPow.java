package com.study.programers;

import java.io.IOException;

public class MathPow {

	
	public static int getPow(int n) {

		double a = Math.sqrt(n);
		
		if(a % 1 == 0)
			return (int) ((a + 1) * (a + 1));
		else
			return -1;
	}
	
	 public static long solution(long n) {
	      
			double a = Math.sqrt(n);
			
			if(a % 1 == 0)
				return (long) ((a + 1) * (a + 1));
			else
				return -1;
	  }

    public static void main(String[] args) throws IOException {
    	System.out.println(solution(121));
    	
    }
}
