package d1023;

import java.awt.Button;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import d1023.GridExam.MyGUI;

public class NullLayout {
	static class MyGUI extends JFrame{
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("Null Layout 실습");
			this.setLayout(null);
			
			JButton btn1=new JButton("버튼1");
			btn1.setBounds(50,50,70,60);
			add(btn1);
			
			JButton btn2=new JButton("버튼2");
			btn2.setBounds(80,80,70,60);
			add(btn2);
			
			JButton btn3=new JButton("버튼3");
			btn3.setBounds(110,110,70,60);
			add(btn3);
			
			setSize(256,256);
			setVisible(true);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyGUI();
	}

}
