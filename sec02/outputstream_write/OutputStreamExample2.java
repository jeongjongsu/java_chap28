package sec02.outputstream_write;

import java.io.*;

public class OutputStreamExample2 {

	public static void main(String[] args)throws Exception {
		OutputStream os = new FileOutputStream("c:/test3.txt");
		byte[] osBytes = "ABCDefg5".getBytes();
		os.write(osBytes);
		os.flush();
		os.close();

	}

}
