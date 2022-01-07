package sec03.consol;

import java.io.*;

public class ConsolExample2 {

	public static void main(String[] args)throws Exception {
		InputStream is = System.in;
		byte[] consolChar = new byte[100];
		
		System.out.print("성명 : ");
		int charCnt = is.read(consolChar);
		String data = new String(consolChar, 0,charCnt-2);
		
		System.out.print("주소 : ");
		int charCnt2 = is.read(consolChar);
		String data2 = new String(consolChar, 0,charCnt2-2);
		
		System.out.println("입력한 이름 : " + data);
		System.out.println("입력한 주소 : " + data2);
		
		is.close();
	}

}
