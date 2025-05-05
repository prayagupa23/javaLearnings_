import java.awt.event.*;
import javax.swing.*;
public class actionHandle implements ActionListener{
    JFrame f;
    JTextField tf;
    JLabel l;
    JButton b;

    actionHandle(){
        f= new JFrame("Action Listener Demo");
        tf= new JTextField();
        l= new JLabel("Enter Name:");
        b= new JButton("Submit");
 
        l.setBounds(50,50,100,30);
        tf.setBounds(160,50,200,30);
        b.setBounds(50,100,150,35);

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
        String str= tf.getText();
        tf.setText("Hi "+str);
    }

    public static void main(String args[]){
        actionHandle a= new actionHandle();
    }

}