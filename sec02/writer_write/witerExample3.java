package sec02.writer_write;

import java.io.*;

public class witerExample3 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/TEST6.txt");
		char[] writeChar = "홍길동 입니다.".toCharArray();
		writer.write(writeChar,1,2);

		writer.flush();
		writer.close();
	}

}
