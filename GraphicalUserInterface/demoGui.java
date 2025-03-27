package GraphicalUserInterface;
import javax.swing.*;
class demoGui{
    public static void main(String args[]){
        JFrame f1= new JFrame("User Login");

        //Labels defining full name, password & address fields respectively.        
        JLabel l1= new JLabel("Full Name");
        JLabel l2= new JLabel("Password");
        JLabel l3= new JLabel("Address");

        //textfield, textarea & password field
        JTextField name= new JTextField("enter your name");
        JPasswordField pass= new JPasswordField(8);
        JTextArea address= new JTextArea();

        
        l1.setBounds(50,50,100,30);
        l2.setBounds(50,100,100,30);
        l3.setBounds(50,150,100,30);

        name.setBounds(150,50,200,30);
        pass.setBounds(150,100,200,30);
        address.setBounds(150,150,200,60);

        f1.add(l1);
        f1.add(name);
        f1.add(l2);
        f1.add(pass);
        f1.add(l3);
        f1.add(address);

        f1.setSize(400,300);
        f1.setVisible(true);
        f1.setLayout(null);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}