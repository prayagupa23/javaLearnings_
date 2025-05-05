//JTextField and JPasswordField
import javax.swing.*;
class gui3{
    public static void main(String args[]){
        JFrame f= new JFrame("Login");
        
        JLabel l1= new JLabel("Name:");
        JLabel l2= new JLabel("Password:");
        
        JTextField tf1= new JTextField();
        JPasswordField pf1= new JPasswordField();

        JButton jb1= new JButton("Submit");

        l1.setBounds(50,50,100,30);
        l2.setBounds(50,100,100,30);
         
        tf1.setBounds(160,50,200,30);
        pf1.setBounds(160,100,200,30);
     
        jb1.setBounds(160,150,150,35);

        f.add(l1);
        f.add(tf1);
        f.add(l2);
        f.add(pf1);
        f.add(jb1);

        f.setLayout(null); 
        f.setSize(450,350);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
}