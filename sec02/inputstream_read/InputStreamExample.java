package sec02.inputstream_read;

import java.io.*;

public class InputStreamExample {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("c:/test.txt");
		/*  while(true){
			int readByte = is.read();
			if(readByte == -1) break;
			System.out.print((char)readByte);		
		  } 
		  */
		int readByte;
		while((readByte = is.read()) != -1){
			System.out.print((char)readByte);
		}
		is.close();  

	}

}
