package d1023;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridExam {
	static class MyGUI extends JFrame{
	MyGUI(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("GridLayout Layout 실습");
		setLayout(new GridLayout(3,3,10,10));
		/*
		JButton btn1= new JButton("버튼1");
		add(btn1);
		JButton btn2= new JButton("버튼2");
		add(btn2);
		JButton btn3= new JButton("버튼3");
		add(btn3);
		JButton btn4= new JButton("버튼4");
		add(btn4);
		JButton btn5= new JButton("버튼5");
		add(btn5);
		JButton btn6= new JButton("버튼6");
		add(btn6);
		JButton btn7= new JButton("버튼7");
		add(btn7)
		JButton btn8= new JButton("버튼8");
		add(btn8);
		JButton btn9= new JButton("버튼9");
		add(btn9);
		*/
		JButton [] btn= new JButton[9];
		for(int i=0; i<btn.length; i++) {
			btn[i]=new JButton("버튼"+(i+1));
			add(btn[i]);
		}
		
		setSize(256,256);
		setVisible(true);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyGUI();
	}

}
