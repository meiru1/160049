import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JPaneTest extends JFrame{
	public JPaneTest(){
		setSize(400, 300);
		setTitle("JPanelのテスト");

		MyJPanel myjp = new MyJPanel();
		Container c = getContentPane();
		c.add(myjp);
	}

	public static void main(String[] args) {
		JFrame w = new JPaneTest();
		w.show();
	}

}

class MyJPanel extends JPanel {
	public void paintComponent(Graphics g) {
		su
	}
}