package sec03.consol;

import java.io.*;

public class ConsolExample1 {

	public static void main(String[] args) throws Exception {
		System.out.println("=== �޴� ====");
		System.out.println("1. ���� ����");
		System.out.println("2. ���� �ֱ�");
		System.out.println("3. ���� ã��");
		System.out.print("�޴��� �ϳ��� �׸��� �����ϼ��� :");
		InputStream is = System.in;
		char ch = (char)is.read();
		
		switch(ch){
		  case('1') : 
			  System.out.println("1. ���� ���⸦ �����ϼ̽��ϴ�.");
			  break;
		  case('2') : 
			  System.out.println("2. ���� �ֱ⸦ �����ϼ̽��ϴ�.");
			  break;
		  case('3') : 
			  System.out.println("3. ���� ã�⸦ �����ϼ̽��ϴ�.");
			  break;
		}
		
		is.close();;
	}

}
