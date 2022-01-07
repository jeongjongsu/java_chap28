package sec02.outputstream_write;

import java.io.*;

public class OutputStreamExample3 {

	public static void main(String[] args)throws Exception {
		OutputStream os = new FileOutputStream("c:/test3.txt");
		byte[] osBytes = "WKGDF".getBytes();
		os.write(osBytes,0,4);
	//	os.write(osBytes,4,4);
		os.flush();
		os.close();

	}

}
