package sec03.consol;

import java.io.*;

public class ConsolExample1 {

	public static void main(String[] args) throws Exception {
		System.out.println("=== 메뉴 ====");
		System.out.println("1. 예금 보기");
		System.out.println("2. 예금 넣기");
		System.out.println("3. 예금 찾기");
		System.out.print("메뉴중 하나의 항목을 선택하세요 :");
		InputStream is = System.in;
		char ch = (char)is.read();
		
		switch(ch){
		  case('1') : 
			  System.out.println("1. 예금 보기를 선택하셨습니다.");
			  break;
		  case('2') : 
			  System.out.println("2. 예금 넣기를 선택하셨습니다.");
			  break;
		  case('3') : 
			  System.out.println("3. 예금 찾기를 선택하셨습니다.");
			  break;
		}
		
		is.close();;
	}

}
