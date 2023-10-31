package d1023;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame extends JFrame{
	MyFrame(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Event 실습");
		
		setLayout(new FlowLayout());
		JButton btn1=new JButton("클릭하세요.");
		btn1.addActionListener(new AddActionListener);
		
		
		add(btn1);
		
		setSize(250,250);
		setVisible(true);
	}
}
public class ActionExam {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
