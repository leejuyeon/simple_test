package com.study.programers;

import java.io.IOException;

public class IronMan {

	
	public static int getPower(int distance) {
		int result = 0;

		while (distance != 0) {
			if(distance%2 == 0) {
				distance = distance/2;
			}else {
				distance = distance-1;
				result ++;
			}
		}
		

		
		
		return result;
	}
	

    public static void main(String[] args) throws IOException {
    	System.out.println(getPower(5));
    	System.out.println(getPower(6));
    	System.out.println(getPower(5000));
    	
    }
}
