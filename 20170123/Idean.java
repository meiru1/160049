import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Idean {
  public static void main(String[] args) {
    AlohaWindowMan man = new AlohaWindowMan();
  }
}

class AlohaWindowMan implements ActionListener{
  JFrame frame;
  JButton btnClick;
  JButton btnSave;
  JPanel panel;
  JTextField fileName;
  JScrollPane scrollPane;
  JTextArea textArea;
  JLabel label;




  public AlohaWindowMan(){
    frame = new JFrame("Idean");
    frame.setLocation(300,300);
    frame.setSize(300,300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    btnClick = new JButton("Click");
    btnClick.addActionListener(this);
    btnClick.setActionCommand("Click");

    btnSave = new JButton("Save");
    btnSave.addActionListener(this);
    btnSave.setActionCommand("Save");


    fileName = new JTextField("hello",20);


    panel = new JPanel();
    panel.add(fileName);
    panel.add(btnClick);
    panel.add(btnSave);

    textArea = new JTextArea(10, 30);

    scrollPane = new JScrollPane(textArea);

    Container con = frame.getContentPane();
    con.setLayout(new GridLayout(2,1));
    con.add(panel);
    con.add(scrollPane);

    fileName.setText("click");
    textArea.setText("aloha");


    frame.setVisible(true);
  }

    public void actionPerformed(ActionEvent ae){
        String cmd = ae.getActionCommand();

        if(cmd.equals("Click")){
          fileName.setText("Click");
        } else if(cmd.equals("Save")){
          fileName.setText("Save");
        }
  }
}

