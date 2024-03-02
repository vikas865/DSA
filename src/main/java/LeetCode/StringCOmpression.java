package LeetCode;

public class StringCOmpression {

	public static String getCompressedString(String str) {

		// String str="aaabbcccddaeef";
		// a b c d a e f
		String s = "" + str.charAt(0);

		for (int i = 1; i < str.length(); i++) {
			char current = str.charAt(i);
			char prev = str.charAt(i - 1);

			if (current != prev) {
				s = s + current;
			}

		}
		System.out.println(s);

		return s;

	}

	public static String getCompressedStringWithCount(String str) {

		String s = "" + str.charAt(0);

		int count = 1;

		for (int i = 1; i < str.length(); i++) {
			char current = str.charAt(i);
			char prev = str.charAt(i - 1);

			if (current != prev) {
				if (count > 1) {
					s = s + count;
					count = 1;
				}

				s = s + current;

			} else {
				count++;
			}

		}
		
		if (count > 1) {
			s = s + count;
			count = 1;
		}
		System.out.println(s);

		return s;

	}

	public static void main(String[] args) {

		String str = "aaabbcccddaeeff";
		// a b c d a e f

		getCompressedString(str);

		getCompressedStringWithCount(str);

	}

}
