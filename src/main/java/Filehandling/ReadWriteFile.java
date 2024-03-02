package Filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadWriteFile {
	
	
	
	public static void main(String[] args) {
		
		try {
			FileReader fs = new FileReader("Filetest.txt");
			FileWriter fw= new FileWriter("demo.txt");
			BufferedReader bf =new BufferedReader(fs);
			PrintWriter pw=new PrintWriter(fw);
			
			String str= null;
			
			while((str=bf.readLine())!=null)
			{
				pw.write(str);
				
			}
			  
			  
			
			
			
			fs.close();
			fw.close();
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
