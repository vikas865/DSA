package LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class L205IsomorphicString {

	public static boolean isIsomorphic(String s1, String s2) {

		if (s1.length() != s2.length()) {
			return false;
		}

		Map<Character, Character> map = new HashMap<>();
		for (int i = 0; i < s1.length(); i++) {
			char c1 = s1.charAt(i);
			char c2 = s2.charAt(i);

			if (map.containsKey(c1)) {
				if (map.get(c1) != c2) {
					System.out.println(map.get(c1)+"->"+c2);
					return false; // inconsistent mapping
				}
			} else {
				if (map.containsValue(c2)) {
					System.out.println(c2);
					return false; // multiple characters are mapped to the same character in s1
				}
				map.put(c1, c2);
				System.out.println(map);
			}
		}

		return true;
	}

	public static void main(String[] args) {

		// String s = "egg";
		// String t = "add";
//		String s = "bbbaaaba";
//		String t = "aaabbbba";
		String s="badc";
		String t= "baea";
		System.out.println(isIsomorphic(s, t));
	}

}
