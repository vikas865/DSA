package LeetCode;

public class L125EfficientLeet {


	    public static  boolean isPalindrome(String s) {
	        char[] charArray = s.toCharArray();
	        for(char c :charArray)
	        {
	        	System.out.print(c+"->");
	        }
	        System.out.println();
	        int ind = sanitize(charArray);
	        
	        
	        
	        if (ind < 2) {
	            return true;
	        }
	        int i = 0;
	        int j = ind - 1;
	        while (i < j) {
	            if (charArray[i] != charArray[j]) {
	                return false;
	            }
	            i++;
	            j--;
	        }
	        return true;
	    }

	    private static int sanitize(char[] charArray) {
	        int index = 0;
	        for (int i = 0; i < charArray.length; i++) {
	            if (charArray[i] >= 48 && charArray[i] <= 57) {
	                charArray[index] = (char) charArray[i];
	                index++;
	            } else if (charArray[i] >= 65 && charArray[i] <= 90) {
	                charArray[index] = (char) (charArray[i] + 32);
	                index++;
	            } else if (charArray[i] >= 97 && charArray[i] <= 122) {
	                charArray[index] = (char) charArray[i];
	                index++;
	            }
	        }
	        
	        
	        for(char c :charArray)
	        {
	        	System.out.print(c+"->");
	        }
	        return index;
	    }
	    
	    
	    
	    public static void main(String[] args) {
    	    	String s = "A man, a plan, a canal: Panama ";
			//String s = "race a car";
			//String s="0P";
			System.out.println(isPalindrome(s));
		}
	
	
	
}
