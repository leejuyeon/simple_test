package com.study.programers;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Runner {

	public static String getResult(String[] participant, String[] completion) {
		/*
		 * Arrays.sort(participant); Arrays.sort(completion);
		 * 
		 * int i; for( i = 0; i < completion.length; i++) {
		 * if(participant[i].equals(completion[i]) == false) return participant[i]; }
		 * return participant[i];
		 */

		String answer = "";
		HashMap<String, Integer> hm = new HashMap<>();
		for (String player : participant)
			hm.put(player, hm.getOrDefault(player, 0) + 1);
		for (String player : completion)
			hm.put(player, hm.get(player) - 1);

		for (String key : hm.keySet()) {
			if (hm.get(key) != 0) {
				answer = key;
			}
		}
		return answer;

	}

	public static void main(String[] args) throws IOException {
		String[] participant = { "leo", "kiki", "eden" };
		String[] completion = { "eden", "kiki" };
		System.out.println(getResult(participant, completion));

	}
}
