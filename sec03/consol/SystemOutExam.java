package sec03.consol;

import java.io.*;

public class SystemOutExam {

	public static void main(String[] args) throws IOException {
		OutputStream os = System.out;
		for(byte a=48; a<58; a++ ){
			os.write(a);
		}
		os.write(13);
		os.flush();
		
		for(byte a=97; a<123; a++ ){
			os.write(a);
		}
		os.write(13);
		os.flush();
		
		String data = "가나다라바바사";
		byte[] byteData = data.getBytes();
		os.write(byteData);
		os.flush();
		

	}

}
