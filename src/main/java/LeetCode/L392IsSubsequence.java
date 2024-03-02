package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class L392IsSubsequence {
	
public static boolean isSubsequence(String s, String t) {
	
	if(s.isEmpty())
		return true;
	
	//List<String> allsubseq= findSubsequences(t);
	int n = t.length();
    for (int i = 1; i < (1<<n); i++) {	
    StringBuilder sb = new StringBuilder();
    for (int j = 0; j < n; j++) {
        // Check if jth bit in i is set
    
        if ((i & (1 << j)) > 0) {
        	//System.out.print("-->"+j+"->"+str.charAt(j));
            sb.append(t.charAt(j));
            
        }
       
    }
    
    if (sb.toString().equals(t))
    	return true;
   
}
	
	return false;
	
	 
    }





private static List<String> findSubsequences(String str) {
    List<String> subsequences = new ArrayList<>();
    int n = str.length();
    // Number of subsequences = 2^n
    

    // Generate all possible subsequences using bit manipulation
        for (int i = 1; i < (1<<n); i++) {	
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < n; j++) {
            // Check if jth bit in i is set
        
            if ((i & (1 << j)) > 0) {
            	//System.out.print("-->"+j+"->"+str.charAt(j));
                sb.append(str.charAt(j));
                
            }
           
        }
        subsequences.add(sb.toString());
       
    }

    
    return subsequences;
}


public static boolean isSubsequenceOptimized(String s, String t) {
	
//	 "abc";
//	 "ahbgdc";
	
    if (s.isEmpty())
        return true;

    Stack<Character> stk = new Stack<>();

    for (int i = s.length() - 1; i >= 0; i--) {
        stk.push(s.charAt(i));

    }

    for (int j = 0; j < t.length(); j++) {
        if (!stk.isEmpty() && stk.peek() == t.charAt(j)) {
            stk.pop();
        }

    }

   // System.out.println(stk);

    return stk.isEmpty();
}
	
public static boolean isSubsequenceNew(String str, String t) {
    int lastPos = 0;
    char prevChar = 0;
    String sub = t;
    if (str.length() > t.length()) {
        return false;
    }
    for (int i = 0; i < str.length(); i++) {
        char s = str.charAt(i);
        if (sub.indexOf(s) == -1) {
            return false;
        } else {
            if (sub.indexOf(s) >= lastPos ) {
                prevChar = s;
                lastPos = sub.indexOf(s);
                sub = sub.substring(lastPos + 1);
                lastPos = sub.indexOf(s);
                System.out.println(lastPos);
            } else {
                return false;
            }
        }
    }
    return true;
}

	
	public static void main(String[] args) {
		
		String s = "aabc";
		String t = "aahbgdc";
		
		System.out.println(isSubsequence(s,t));
	//	printSubSequence(s);
		//findSubsequences(s);
		
	//	isSubsequenceOptimized(s,t);
		isSubsequenceNew(s,t);
				
	}

}
