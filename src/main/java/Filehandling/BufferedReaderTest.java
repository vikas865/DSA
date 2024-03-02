
package Filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.FileHandler;

public class BufferedReaderTest {

	
	
	public static void main(String[] args)  {
		
		FileReader fs;
		try {
			fs = new FileReader("FIletest.txt");
			BufferedReader bf=	new BufferedReader(fs);
			
			while(true) {
				
				String s= bf.readLine();
				
				if(s== null)
				{
					break;
				}
				System.out.println(s);
				
				
				
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
		
	}
}
