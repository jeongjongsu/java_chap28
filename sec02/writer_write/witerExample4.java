package sec02.writer_write;

import java.io.*;

public class witerExample4 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/TEST7.txt");
		String data = "�ȳ��ϼ���. ������ �Դϴ�";
		writer.write(data);

		writer.flush();
		writer.close();
	}

}
