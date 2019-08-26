package com.study.programers;

import java.io.IOException;

public class IntegerTest {

	public static String getResult(int no) {
		String an = "";
		int a = 0;
		while (no > 0) {
			a = no % 3;
			no = no / 3;
			if(a == 0) {
				no -= 1;
				a = 4;
			}
			an = a + an;
		}
		return an;
	}
	

    public static void main(String[] args) throws IOException {
    	System.out.println(getResult(6));
    	System.out.println(getResult(10));
    	
    }
}
