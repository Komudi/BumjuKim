package Ex09_07;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FlyingTextEx extends JFrame {
	private JLabel la = new JLabel("HELLO");
	
	public FlyingTextEx() {
		super("상, ㅁㄴㅇㄹ 텍스트 움직이기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		c.addKeyListener(new MyKeyListener());
		la.setLocation(50,50);
		la.setSize(100,20);
		c.add(la);
		setSize(200,200);
		setVisible(true);
	}
	
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e ) {
			int keyCode = e.getKeyCode();
			switch(keyCode) {
			case KeyEvent.VK_UP:
				la.setLocation(la.getX(), la.getY()-10);break;
			case KeyEvent.VK_DOWN:
				la.setLocation(la.getX(), la.getY()+10);break;_
			case KeyEvent.VK_LEFT:
				la.setLocation(la.getX()-10, la.getY());break;_
			case KeyEvent.VK_RIGHT:
				la.setLocation(la.getX() +10, la.getY());break;__
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlyingTextEx();

	}

}
