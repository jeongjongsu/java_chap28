package sec05.scanner;

import java.util.*;

public class ScannerExam1 {

	public static void main(String[] args){
	  Scanner scanner = new Scanner(System.in);
	  
	  System.out.print("���� �Է� > ");
	  String inputString = scanner.nextLine();
	  System.out.println(inputString);
	  
	  System.out.println();
	  
	  System.out.print("���� �Է� > ");
	  int inputInt = scanner.nextInt();
	  System.out.println(inputInt);

	  System.out.println();
	  
	  System.out.print("�Ǽ� �Է� > ");
	  double inputDouble = scanner.nextDouble();
	  System.out.println(inputDouble);
	// �ڸ�Ʈ  

	}

}
