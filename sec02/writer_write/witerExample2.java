package sec02.writer_write;

import java.io.*;

public class witerExample2 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/TEST5.txt");
		char[] writeChar = "ȫ�浿 �Դϴ�.".toCharArray();
		writer.write(writeChar);

		writer.flush();
		writer.close();
	}

}
