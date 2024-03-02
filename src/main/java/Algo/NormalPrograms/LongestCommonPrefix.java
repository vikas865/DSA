package Algo.NormalPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class LongestCommonPrefix {

	public static String getLongestPrefix(String[] strs) {

		int min = Arrays.stream(strs).map(e -> e.length()).min(Integer::compare).orElse(0);
		// System.out.println(min);

		boolean flag = true;
		int counter = 0;
		StringBuilder res = new StringBuilder();

		while (flag) {
			HashSet<String> aresame = new HashSet<>();

			for (int i = 0; i < strs.length; i++) {
				if (strs[i].length() > counter) {
					
					aresame.add(String.valueOf(strs[i].charAt(counter)));
					//System.out.println(aresame);

				} else {
					flag = false;
					break;
				}

			}

			if (flag) {
				if (aresame.size() != 1) {
					flag = false;
				} else {
					res.append(new ArrayList<>(aresame).get(0));
					counter++;
				}
			}

		}

		return res.toString();
	}

	public static void main(String[] args) {
		String[] strs = { "flower", "flow", "flight" };
		// String[] strs = { "dog", "racecar", "car" };

		System.out.println(getLongestPrefix(strs));
	}

}
