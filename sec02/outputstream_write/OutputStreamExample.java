package sec02.outputstream_write;

import java.io.*;

public class OutputStreamExample {

	public static void main(String[] args)throws Exception {
		OutputStream os = new FileOutputStream("c:/test3.txt");
		byte[] osBytes = "ABCD5".getBytes();
		for(int i=0 ; i < osBytes.length ; i++ ){
			os.write(osBytes[i]);
		}
		os.flush();
		os.close();

	}

}
