package Ex02_12;
import java.util.*;

public class Grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���");
		int score = scanner.nextInt();
		if(score>=90) {
			grade='a';
		}
		else if(score >=80) {
			grade = 'b';
		}
		else if(score >=70) {
			grade = 'c';
		}
		else if(score >=60) {
			grade = 'd';
		}
		else
			grade = 'f';
		
		
		System.out.println("������ " + grade +"�Դϴ�");
		scanner.close();
	}

}
