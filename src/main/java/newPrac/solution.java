package newPrac;

import java.util.Arrays;

class solution {
	   public static boolean winnerOfGame(String colors) {
		   
		   System.out.println(colors.replaceAll("A{3,}", "AA"));
		   System.out.println(colors.replaceAll("B{3,}", "BB"));
		   StringBuilder sb = new StringBuilder(colors); 
		     int n = colors.length();
	        byte[] b = new byte[n];
	        colors.getBytes(0, n, b, 0);
	        
	       // Map<Integer, Integer> map = new HashMap<>();
	       // map.ge
	        
	        System.out.println(Arrays.toString(b));
		   
	        return colors.replaceAll("A{3,}", "AA").length() < colors.replaceAll("B{3,}", "BB").length();
	    }
    public static void main(String[] args) {
		//String s = "AAABABB";
		String s = "AAAABBBB";
		
		System.out.println(winnerOfGame(s));
		
	}
}
