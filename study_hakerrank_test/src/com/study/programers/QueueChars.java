package com.study.programers;

import java.io.IOException;

public class QueueChars {

	
	public static int getPower(String skill, String[] skill_trees) {
		int answer = skill_trees.length;
		int beforeIdx = 0;
		int currentIdx = 0;
		
		for (int i = 0; i < skill_trees.length; i++) {
			beforeIdx = skill_trees[i].indexOf(skill.charAt(0));
			for (int j = 1; j < skill.length(); j++) {
				currentIdx = skill_trees[i].indexOf(skill.charAt(j));
				if((beforeIdx > currentIdx && currentIdx != -1) || (beforeIdx == -1 && currentIdx != -1)) {
					answer--;
					break;
				} 
				beforeIdx = currentIdx;
			}
		}

		return answer;
	}

    public static void main(String[] args) throws IOException {
    	String[] aa = {"BACDE","CBADF", "AECB", "BDA"};
    	System.out.println(getPower("CBD", aa));
    	
    }
}
