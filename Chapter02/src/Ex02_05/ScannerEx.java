package Ex02_05;
import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�̸�, ����, ����, ü��, ���� ���θ� ��ĭ���� �Ф��Ͽ� �Է��ֿ�");
		
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		System.out.println("����� �̸��� " + name + "�Դϴ�.");
		String city = scanner.next();
		System.out.println("����� ���ô�" + city + "�Դϴ�.");
		int age = scanner.nextInt();
		System.out.println("����� ���̴�" + age + "�Դϴ�.");
		double weight = scanner.nextDouble();
		System.out.println("����� �����Դ�" + weight + "�Դϴ�.");
		boolean single = scanner.nextBoolean();
		System.out.println("����� ���ſ��δ�" + single + "�Դϴ�.");

		scanner.close();
		
	}

}
