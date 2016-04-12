package calc.function;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

class MyPanel extends JPanel {
	 JButton one, two, three, four, five, six, seven, eight, nine, zerro, is, plus, minus, intwo, zerroTwo, mnoj;
	 JTextField text;
	
	public MyPanel() {
		one = new JButton("1");
		two = new JButton("2");
		three = new JButton("3");
		four = new JButton("4");
	    five = new JButton("5");
		six = new JButton("6");
		seven = new JButton("7");
		eight = new JButton("8");
		nine = new JButton("9");
		zerro = new JButton("0");
		zerroTwo = new JButton("0 0");
		is = new JButton("=");
		plus = new JButton("+");
		minus = new JButton("-");
		mnoj = new JButton("*");
		intwo = new JButton("/");
			text  = new JTextField();
			text.getText();
			text.setColumns(23);
			text.setEditable(false);
		
		add(text);
		add(one);
		add(two);
		add(three);
		add(four);
		add(five);
		add(six);
		add(seven);
		add(eight);
		add(nine);
		add(zerro);
		add(zerroTwo);
		add(is);
		add(plus);
		add(minus);
		add(mnoj);
		add(intwo);
		
		//Позиція, розмір.
		one.setBounds(5, 50, 85, 30);
		two.setBounds(5, 90, 85, 30);
		three.setBounds(5, 130, 85, 30);
		four.setBounds(95, 50, 85, 30);
		five.setBounds(95, 90, 85, 30);
		six.setBounds(95, 130, 85, 30);
		seven.setBounds(185, 50, 85, 30);
		eight.setBounds(185, 90, 85, 30);
		nine.setBounds(185, 130, 85, 30);
		zerro.setBounds(185, 170, 85, 30);
		zerroTwo.setBounds(5, 170, 85, 30);
		is.setBounds(95, 170, 85, 30);
		plus.setBounds(275, 50, 85, 30);
		minus.setBounds(275, 90, 85, 30);
		mnoj.setBounds(275, 130, 85, 30);
		intwo.setBounds(275, 170, 85, 30);
		text.setBounds(5, 10, 355, 25);
		
		MyAction oneAction = new MyAction();
		one.addActionListener(oneAction);
		two.addActionListener(oneAction);
		three.addActionListener(oneAction);
		four.addActionListener(oneAction);
		five.addActionListener(oneAction);
		six.addActionListener(oneAction);
		seven.addActionListener(oneAction);
		eight.addActionListener(oneAction);
		nine.addActionListener(oneAction);
		zerro.addActionListener(oneAction);
		zerroTwo.addActionListener(oneAction);
		is.addActionListener(oneAction);
		plus.addActionListener(oneAction);
		minus.addActionListener(oneAction);
		mnoj.addActionListener(oneAction);
		intwo.addActionListener(oneAction);
				
		setLayout(null);
		setBounds(10, 30, 200, 300);
		setVisible(true);
		setPreferredSize(new Dimension(370, 240));
	}

    class MyAction implements ActionListener {

	public void actionPerformed(ActionEvent e){
		text.setText(e.getActionCommand());
		
		}
}
    
    
	
}
