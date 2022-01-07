package sec02.reader_read;

import java.io.*;

public class readerExample2 {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/TEST.TXT");
		int readNum;
		char[] readData = new char[4];
		String stringData = "";
		while(true){
			readNum = reader.read(readData,1,3);
			if(readNum == -1)break;
			stringData += new String(readData,1,readNum);
		}
		System.out.println((stringData));
		reader.close();

	}

}
