package sec03.consol;

import java.io.*;

public class ConsolExample2 {

	public static void main(String[] args)throws Exception {
		InputStream is = System.in;
		byte[] consolChar = new byte[100];
		
		System.out.print("���� : ");
		int charCnt = is.read(consolChar);
		String data = new String(consolChar, 0,charCnt-2);
		
		System.out.print("�ּ� : ");
		int charCnt2 = is.read(consolChar);
		String data2 = new String(consolChar, 0,charCnt2-2);
		
		System.out.println("�Է��� �̸� : " + data);
		System.out.println("�Է��� �ּ� : " + data2);
		
		is.close();
	}

}
