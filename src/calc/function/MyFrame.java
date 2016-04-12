package calc.function;

import javax.swing.JFrame;

	class MyFrame extends JFrame {
	
	public MyFrame() {
		setTitle("calc");
		pack();
		setVisible(true);	
		setSize(370, 240);
		MyPanel panel = new MyPanel();
		add(panel);
	}

}
