
package cgpajarfile;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Application extends JFrame {
    private Container c;
    private JLabel imglabel,Textlabel1,Textlabel2,Textlabel3;
    private JTextArea Ta;
    private JTextField tf1, tf2;
    private JButton jb1,jb2;
    private ImageIcon img;
    private Font f;
    private Cursor cursor;
    private double p,q,r;
    private JRadioButton jr1,jr2;
    private ButtonGroup bg;
    private JCheckBox jcb,jcb1;
    private ActionListener ActionListener;
    
    
    Application(){
   // initComponents(); 
    }
    public void initComponents(){
      c=this.getContentPane();
      c.setLayout(null);
      c.setBackground(Color.ORANGE);
      f=new Font("Arial",Font.BOLD,20);
      cursor=new Cursor(Cursor.HAND_CURSOR);
      img=new ImageIcon(getClass().getResource("cgpaicon.jpg"));
      imglabel=new JLabel(img);
      imglabel.setBounds(175,20,img.getIconWidth(),img.getIconHeight());
      c.add(imglabel);
      
      Textlabel1=new JLabel("Enter mid (40%) number:");
      Textlabel1.setBounds(20,305,265,90);
      Textlabel1.setBackground(Color.green);
      Textlabel1.setFont(f);
      c.add(Textlabel1);
      
      Textlabel2=new JLabel("Enter final (60%) number:");
      Textlabel2.setBounds(20,380,265,90);
      Textlabel2.setFont(f);
      Textlabel2.setBackground(Color.cyan);
      c.add(Textlabel2);
      Textlabel3=new JLabel("Result :");
      Textlabel3.setBounds(20,580,220,90);
      Textlabel3.setFont(f);
      Textlabel3.setBackground(Color.cyan);
      c.add(Textlabel3);
      
      tf1=new JTextField();
      tf1.setBounds(260,335,100,38);
      tf1.setHorizontalAlignment(JTextField.CENTER);
      tf1.setCursor(cursor);
      tf1.setBackground(Color.cyan);
      tf1.setForeground(Color.black);
      tf1.setFont(f);
      c.add(tf1);
      tf2=new JTextField();
      tf2.setBounds(260,410,100,38);
      tf2.setHorizontalAlignment(JTextField.CENTER);
      tf2.setBackground(Color.cyan);
      tf2.setForeground(Color.black);
      tf2.setCursor(cursor);
      tf2.setFont(f);
      c.add(tf2);
      bg=new ButtonGroup();
      
      jb1=new JButton("Submit");
      jb1.setBounds(100,500,100,50);
      jb1.setBackground(Color.red);
      jb1.setFont(f);
      jb1.setCursor(cursor);
      c.add(jb1);
      jb2=new JButton("Cancel");
      jb2.setBounds(350,500,100,50);
      jb2.setBackground(Color.red);
      jb2.setCursor(cursor);
      jb2.setFont(f);
      c.add(jb2);
      
      Ta=new JTextArea();
      Ta.setBounds(100,560,350,120);
      Ta.setFont(f);
      c.add(Ta);
      jr1=new JRadioButton("AIUB-ian");
      jr1.setBounds(100,265,155,45);
      jr1.setBackground(Color.MAGENTA);
      jr1.setSelected(true);
      jr1.setFont(f);
      c.add(jr1);
      jr1.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent ae) {
              JOptionPane.showMessageDialog(null,"Welcome","Smart",1);} 
              
           });
      jr2=new JRadioButton("Not AIUB-ian");
      jr2.setBounds(320,265,155,45);
      jr2.setBackground(Color.BLUE);
      jr2.setFont(f);
      jr2.setEnabled(false);
      c.add(jr2);
      jr2.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent ae) {
              JOptionPane.showMessageDialog(null,"Gramer chacha is not allowed","Warning",2);} 
              
           });
      bg.add(jr1);
      bg.add(jr2);
      
      jb1.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent ae) {
              String value=tf1.getText();
              if(value.isEmpty()){
                  JOptionPane.showMessageDialog(null,"Enter Your Marks");}
              String value1=tf2.getText();
              if(value1.isEmpty()){
                  JOptionPane.showMessageDialog(null,"Please Enter Your Marks");}
              else{
                Ta.setText("");
             float num1=Float.parseFloat(tf1.getText());
             float num2=Float.parseFloat(tf2.getText());
             p =num1*.4;
             q = num2*.6;
             r=p+q;
             String result=String.valueOf(r);
             String p=String.valueOf(num1);
             String q=String.valueOf(num2);
             Ta.append(result); 
             
              }
          }
    });
      jb2.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent ae) {
             
             Ta.setText("");
          }
    });
    
    jcb=new JCheckBox("Premium");
    jcb.setBounds(100,700,120,40);
    jcb.setBackground(Color.blue);
    jcb.setSelected(true);
    jcb.setFont(f);
    c.add(jcb);
    jcb1=new JCheckBox("General");
    jcb1.setBounds(380,700,120,40);
    jcb1.setBackground(Color.blue);
    jcb1.setEnabled(false);
    jcb1.setFont(f);
    c.add(jcb1);
            }
    public static void main(String[] args) {
        Application app=new Application();
        app.setVisible(true);
        app.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        app.setBounds(300,100,600,900);
        app.setTitle("CGPA Calculator");
    }
   
}
