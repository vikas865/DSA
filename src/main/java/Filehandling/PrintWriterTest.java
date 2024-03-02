package Filehandling;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class PrintWriterTest {
	
	
	public static void main(String[] args) {
		
		
		
		try {
			FileWriter fs= new FileWriter("Filetest.txt");
			
			PrintWriter  ps=  new PrintWriter(fs);
			
			ps.println("I love coding");
			
			ps.close();
			fs.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
