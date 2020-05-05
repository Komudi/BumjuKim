package Ex05_07;


interface PhoneInterface{
	final int TIMEOUT = 10000;
	void sendCall();
	void receiveCall();
	default void printLogo() {
		System.out.println("** Phone **");
	}
}

class Calc{
	public int calculate(int x, int y) {
		return x + y;
	}
}

class SmartPhone extends Calc implements PhoneInterface{

	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("띠리리리ㅣㅇ");
	}

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("전화가 왔습니데이");
	}
	
	public void schedule() {
		System.out.println("일정 관리합니다.");
	}
	
}

public class InterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone phone = new SmartPhone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		System.out.println("3과 5를 더하면" + phone.calculate(3, 5));
		phone.schedule();

	}

}
