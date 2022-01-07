package sec02.writer_write;

import java.io.*;

public class witerExample4 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/TEST7.txt");
		String data = "안녕하세요. 정종수 입니다";
		writer.write(data);

		writer.flush();
		writer.close();
	}

}
