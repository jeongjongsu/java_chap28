package sec02.writer_write;

import java.io.*;

public class witerExample3 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/TEST6.txt");
		char[] writeChar = "ȫ�浿 �Դϴ�.".toCharArray();
		writer.write(writeChar,1,2);

		writer.flush();
		writer.close();
	}

}
