package Ex08_06;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NullContainerEx extends JFrame {
	public NullContainerEx() {
		setTitle("배치관리자 없이 절대 위치에 배치하는 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		
		JLabel la = new JLabel("Hello, press buttons! ");
		la.setLocation(130,50);
		la.setSize(200,20);
		contentPane.add(la);
		
		for (int i = 0; i < 9; i++) {
			JButton b = new JButton(Integer.toString(i));
			b.setLocation(i*15, i*15);
			b.setSize(50,20);
			contentPane.add(b);
		}
		
		setSize(300,200);
		setVisible(true);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NullContainerEx();
	}

}
