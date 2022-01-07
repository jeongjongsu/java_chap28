package sec02.reader_read;

import java.io.*;

public class readerExample1 {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/TEST.TXT");
		int readData;
		
		while(true){
			readData = reader.read();
			if(readData == -1)break;
			System.out.print((char)readData);
		}
		reader.close();

	}

}
