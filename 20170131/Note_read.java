import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class Note_read{
  public static void main(String[] args){
    NoteMan ia = new NoteMan();
  }
}

class NoteMan implements ActionListener{
  // field
  JFrame frame;
  JButton btnOpen;
  JButton btnSave;
  JPanel panel;
  JPanel panel2;
  JTextField field;
  JTextArea area;
  JScrollPane scrollPane;
  String filedata;
  String textdata;
  int max = 128;
  String[] datas = new String[max];
  int co = 0;
  int num = 0;

  public NoteMan(){

    frame = new JFrame("Note_read");
    frame.setLocation(500,250);
    frame.setSize(500,500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    btnOpen = new JButton("Test");
    btnSave = new JButton("Save");

    field = new JTextField(20);
    area = new JTextArea(10,30);
    area.setLineWrap(true);

    panel = new JPanel();
    panel.add(btnOpen);
    panel.add(btnSave);

    scrollPane = new JScrollPane(area);

    Container con = frame.getContentPane();
    con.setLayout(new GridLayout(2,1));
    con.add(panel);
    con.add(scrollPane);

    frame.setVisible(true);

    btnOpen.addActionListener(this);
    btnOpen.setActionCommand("open");

    btnSave.addActionListener(this);
    btnSave.setActionCommand("save");
    try{
        File inFile     = new File("Test.txt");
        FileInputStream fis   = new FileInputStream(inFile);
        InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
        BufferedReader br = new BufferedReader(isr);

        String line;
        while((line = br.readLine()) != null){
          datas[co] = line;
          co++;
        }

        br.close();
      } catch(IOException e){
          System.out.println("error");
      }
    }

  public void actionPerformed(ActionEvent ae) {
    String cmd = ae.getActionCommand();
    // 繰り返し処理でこのしたの文を囲んで、全文表示するようにする
        if(cmd.equals("open")){
      area.setText(datas[num]);
      area.append("\n");
      area.append(datas[1]);
      area.append("\n");
      area.append(datas[2]);
      area.append("\n");
      area.append(datas[3]);
      area.append("\n");
      area.append(datas[4]);
      area.append("\n");
      area.append(datas[5]);
      area.append("\n");
      area.append(datas[6]);
      area.append("\n");
      area.append(datas[7]);
      area.append("\n");
      area.append(datas[8]);
      area.append("\n");
      area.append(datas[9]);
      area.append("\n");
      area.append(datas[10]);
    }else if(cmd.equals("save")){
      textdata = area.getText();
     try{
        File outFile      = new File("change.txt");
        FileWriter fw     = new FileWriter(outFile,true);
        BufferedWriter bw   = new BufferedWriter(fw);
        PrintWriter pw      = new PrintWriter(bw);

        pw.println(textdata);

        pw.close();

      }catch(IOException e){
        System.out.println("error");
      }
    }
  }
}