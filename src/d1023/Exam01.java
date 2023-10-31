package d1023;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam01 {
	static class MyGUI extends JFrame{
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("GUI 실습");
			setLayout(new FlowLayout());
			
			JButton btn1=new JButton("버튼1");
			add(btn1);
			JButton btn2=new JButton("버튼2");
			add(btn2);
			JButton btn3=new JButton("버튼3");
			add(btn3);
			JButton btn4=new JButton("버튼4");
			add(btn4);
			JButton btn5=new JButton("버튼5");
			add(btn5);
			
			setSize(500,500);
			setVisible(true);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyGUI();
	}

}
