package Ex03_12;

import java.util.Scanner;

public class DividedByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int dividened;
		int divisor;
		
		System.out.print("나뉨수를 입력하세요: ");
		dividened = scanner.nextInt();

		System.out.print("나눗수를 입력하세요: ");
		divisor = scanner.nextInt();
		
		System.out.println(dividened + "를 " + divisor +"로 나누면 몫은"
				+ dividened/divisor + "입니다.");
		

	}

}
