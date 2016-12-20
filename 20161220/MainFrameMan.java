	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;

	public class MainFrameMan {
		public static void main(String[] args) {
			FrameMan fm = new FrameMan();
		}
	}


	class FrameMan implements ActionListener {
		// field
		JFrame frame;
		JPanel panel;
		JLabel label;
		JButton button;

		// method
		public FrameMan(){
			System.out.println("ALOHA from FrameMan!");

		frame = new JFrame("FrameMan!");
		frame.setBounds(100, 100, 300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout( new FlowLayout() );

		// パーツをつくる

		panel = new JPanel();
		label = new JLabel("HELLO");
		button = new JButton("ClickMe!");

		button.addActionListener(this);

			panel.add(label);
			panel.add(button);
			frame.add(panel);

			frame.setVisible(true);
		}

		public void actionPerformed(ActionEvent e) {
			label.setText("ALOHA!");
		}
	}
