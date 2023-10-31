package d1023;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import d1023.GridExam.MyGUI;

public class CompExam01 {
	static class MyGUI extends JFrame{
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("component 연습");
			Container c=getContentPane();
			c.setBackground(Color.YELLOW);
			setLayout(new FlowLayout());
			JButton btn1=new JButton("버튼1");
			btn1.setForeground(Color.magenta);
			btn1.setBackground(Color.BLACK);
			add(btn1);
			
			JButton btn2=new JButton("버튼2");
			btn2.setFont(new Font("맑은고딕",Font.BOLD,30));
			btn2.setCursor(new Cursor(Cursor.WAIT_CURSOR));
			btn2.setToolTipText("이 버튼은 크게 보여요");
			add(btn2);
			
			JButton btn3=new JButton("버튼3");
			btn3.setEnabled(false);
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
