package Filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadWriteVIdeos {
	
	
	public static void main(String[] args) {
		
		
		try {
			
			
			
			FileInputStream is= new FileInputStream("Hindi.ogg");
			FileOutputStream io= new FileOutputStream("temp.ogg");
			
			byte[] data= new byte[1024];
			int x=0;
			while((x=is.read(data))>0)
			{
				io.write(data,0,x);
			}
			
			
			is.close();
			io.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
