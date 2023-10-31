package d1023;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BoaderExam {
	static class MyGUI extends JFrame{
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("Boader Layout 실습");
			setLayout(new BorderLayout(10,10));
			
			JButton btn1= new JButton("버튼1");
			add(btn1,BorderLayout.NORTH);
			
			JButton btn2= new JButton("버튼2");
			add(btn2,BorderLayout.WEST);
			
			JButton btn3= new JButton("버튼3");
			add(btn3,BorderLayout.CENTER);
			
			JButton btn4= new JButton("버튼4");
			add(btn4,BorderLayout.EAST);
			
			JButton btn5= new JButton("버튼5");
			add(btn5,BorderLayout.SOUTH);
			
			setSize(256,256);
			setVisible(true);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyGUI();
	}

}
