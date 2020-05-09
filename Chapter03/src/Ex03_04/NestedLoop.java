package Ex03_04;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(i + "*" + j + "=" + i*j);
				System.out.print('\t');
			}
			System.out.println();
		}

	}

}
