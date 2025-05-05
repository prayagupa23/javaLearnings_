import java.awt.event.*;
import javax.swing.*;
public class actionHandle2 implements ActionListener{
    JFrame f;
    JLabel l;
    JTextField tf;
    JButton b;

    actionHandle2(){
        f= new JFrame("Square of a number");
        l= new JLabel("Enter a number:");
        tf= new JTextField();
        b= new JButton("Square");

        l.setBounds(50,50,100,30);
        tf.setBounds(160,50,200,30);
        b.setBounds(160,100,150,35);

        b.addActionListener(this);
  
        f.add(l);
        f.add(tf);
        f.add(b);

        f.setLayout(null);
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   
    public void actionPerformed(ActionEvent e){
        int num= Integer.parseInt(tf.getText());
        tf.setText(Integer.toString(num*num));
    }

    public static void main(String args[]){
        actionHandle2 a= new actionHandle2();
    }
}