package Ex03_13;

import java.util.Scanner;

public class DividedByZeroHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int dividened;
		int divisor;
		
		System.out.print("�������� �Է��ϼ���: ");
		dividened = scanner.nextInt();

		System.out.print("�������� �Է��ϼ���: ");
		divisor = scanner.nextInt();
		
		
		
		try {
			System.out.println(dividened + "�� " + divisor +"�� ������ ����"
					+ dividened/divisor + "�Դϴ�.");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("0���� ���� �� �����ϴ�!");
		}
		finally {
			scanner.close();
		}

	}

}
