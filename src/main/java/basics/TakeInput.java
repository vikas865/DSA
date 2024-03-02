package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TakeInput {
	
	public static void fromScanner()
	{
		Scanner sc = new Scanner(System.in);
		
		String s= sc.nextLine();
		int n=sc.nextInt();
		//sc.nextLine();
		
		
		int m =sc.nextInt();
		System.out.println(n+" "+ s +" "+ m);
		
		
		
	}
	
	
	public static void fromBufferedReader()
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n;
		char s;
		try {
			 s =(char) bf.read();
			 //s= bf.readLine();
			 System.out.println(" "+s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		//fromScanner();
		fromBufferedReader();
		
	}


}
