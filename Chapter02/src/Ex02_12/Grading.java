package Ex02_12;
import java.util.*;

public class Grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요");
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
		
		
		System.out.println("학점은 " + grade +"입니다");
		scanner.close();
	}

}
