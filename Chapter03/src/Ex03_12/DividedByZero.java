package Ex03_12;

import java.util.Scanner;

public class DividedByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int dividened;
		int divisor;
		
		System.out.print("�������� �Է��ϼ���: ");
		dividened = scanner.nextInt();

		System.out.print("�������� �Է��ϼ���: ");
		divisor = scanner.nextInt();
		
		System.out.println(dividened + "�� " + divisor +"�� ������ ����"
				+ dividened/divisor + "�Դϴ�.");
		

	}

}
