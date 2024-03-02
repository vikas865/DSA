package basics;

//Java Program to Illustrate BufferedReader Class 
//Via Its Methods 

import java.util.Scanner; 

//Class 
class Test { 

	
	
	    static int nthFibonacci(int n){
	        // code here
	        int first=1 , second=1 ;
	        int res=0;
	        if(n<=2)
	             return 1;
	        for(int i=3; i<=n ;i++)
	        {
	            res = first + second;
	            first=second;
	            second=res;
	        }
	        return (int) (res%1000000007);
	    }
	   
	

	    public static void main(String[] args) {
	    
	        int num1 = 16;
	 
	  
	       // int num2 = 8;
	 
	        System.out.println(nthFibonacci(14521));
	 //9785989
	  
	    }
	}