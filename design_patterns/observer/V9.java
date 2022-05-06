package observer;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.Year;

//观察者的实际应用
class TestFrame extends Frame{
	public void launch() {
		Button b = new Button("Press me!");
		b.addActionListener(new MyActionListener());
		b.addActionListener(new MyActionListener2());
		this.add(b);
		this.pack();
		this.setLocation(600, 300);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		this.setVisible(true);
	}
	
	//相当于观察者
	private class MyActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			((Button)e.getSource()).setLabel("press me again!");
			System.out.println("button pressed！");
		}
	}
	//相当于观察者
	private class MyActionListener2 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("button pressed！2");
		}
	}
}

public class V9 {
	public static void main(String[] args) {
		new TestFrame().launch();
	}
}
