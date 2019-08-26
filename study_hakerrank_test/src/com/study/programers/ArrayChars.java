package com.study.programers;

import java.io.IOException;
import java.util.Stack;

public class ArrayChars {

	
	public static int getPower(String chars) {
		Stack<Character> stack = new Stack<>();

		for(char c: chars.toCharArray()) {
			if(!stack.isEmpty() && stack.peek() == c) stack.pop();
			else stack.push(c);
		}

		return stack.isEmpty()? 1: 0;
	}
	

    public static void main(String[] args) throws IOException {
    	System.out.println(getPower("baabaa"));
    	System.out.println(getPower("cdcd"));
    	
    }
}
