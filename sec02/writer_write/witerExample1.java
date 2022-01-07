package sec02.writer_write;

import java.io.*;

public class witerExample1 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/TEST3.txt");
		char[] writeChar = "ȫ�浿".toCharArray();
		for(int i = 0; i < writeChar.length ; i++){
			writer.write(writeChar[i]);
		}
		writer.flush();
		writer.close();
	}

}
