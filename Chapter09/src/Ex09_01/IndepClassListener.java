package Ex09_01;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class IndepClassListener extends JFrame {
	public IndepClassListener() {
		setTitle("Action �̺�Ʈ ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());
		c.add(btn);
		
		setSize(250,102);
		setVisible(true);
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new IndepClassListener();

	}
	
	class MyActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JButton b = (JButton)e.getSource();
			if(e.getActionCommand().equals("Action"))
				b.setText("�׼�");
			else
				b.setText("Action");
			
		}
		
	}

}
