package Ex03_06;

import java.util.Scanner;

public class BreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("exit를 입력하면 종료");
		while(true) {
			System.out.print(">>");
			String text = scanner.nextLine();
			if(text.equals("exit"))
				break;
		}
		System.out.println("종료합니다..");
		
		scanner.close();

	}

}
