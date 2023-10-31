package d1023;

import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;

public class ComboExam {
	static class MyGUI extends JFrame{
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("ComboBox 실습");
			setLayout(new FlowLayout());
			String [] pet= {"고양이","강아지","토끼","코알라","송아지"};
			JList list=new JList(pet);
			add(list);
			JComboBox combo=new JComboBox(pet);
			add(combo);
			
			setSize(200,200);
			setVisible(true);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyGUI();
	}

}
