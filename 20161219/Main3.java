import java.awt.FlowLayout;
import javax.swing.*;
public class Main3 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("はじめてのGUI");
		JButton button = new JButton("押してね");
		JLabel label = new JLabel("Hello World!!");
		frame.getContentPane().setLayout(new FlowLayout());
		frame.getContentPane().add(button);
		frame.getContentPane().add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 100);
		frame.setVisible(true);

	}
}