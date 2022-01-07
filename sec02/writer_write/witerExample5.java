package sec02.writer_write;

import java.io.*;

public class witerExample5 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/TEST7.txt");
		String data = "안녕하세요. 정종수 입니다";
		writer.write(data,7,7);

		writer.flush();
		writer.close();
	}

}
