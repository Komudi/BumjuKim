package Ex06_02;
class Point{
	public Point(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x = x; this.y = y;
	}
	
	public String toString() {
		return "Point(" + x +"," + y +")";
	}

	private int x,y;
	
}

public class ToStringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point a = new Point(2,3);
		System.out.println(a.toString());
		System.out.println(a);
		

	}

}
