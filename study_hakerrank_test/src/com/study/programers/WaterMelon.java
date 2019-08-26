package com.study.programers;

import java.io.IOException;

public class WaterMelon {

	
	public static String getMelon(int n) {

		StringBuilder bl = new StringBuilder();
		
		for(int i = 0; i< n/2; i++) {
			bl.append("수박");
		}
		
		if(n%2 != 0) {
			bl.append("수");
		}
		
		
		return bl.toString();
	}
	

    public static void main(String[] args) throws IOException {
    	System.out.println(getMelon(7));
    	
    }
}
