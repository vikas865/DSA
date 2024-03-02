package Filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
	
	
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fs= null;
		try {
			 fs=new FileWriter("Filetest.txt");
			
			fs.write("How Are you");
			fs.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			fs.close();
		}
		
	}

}
