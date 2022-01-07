package sec02.inputstream_read;

import java.io.*;

public class InputStreamExample2 {
	public static void main(String[] args)throws Exception{
	  InputStream is = new FileInputStream("C:/test.txt");
	  int byteNo;
	  String byteString = "";
	  byte[] byteStream = new byte[3];
	  while(true){
		if((byteNo = is.read(byteStream)) == -1) break;
		byteString += new String(byteStream,0,byteNo);    
	  }
	  System.out.println(byteString);
	  
	  is.close();
	}
	


}
