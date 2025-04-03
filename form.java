import javax.swing.*;
class form{
    public static void main(String args[]){
        JFrame frame= new JFrame("Registration Form");
    
        JLabel name= new JLabel("Name");
        JLabel mail= new JLabel("Email");
        JLabel pass= new JLabel("Password");
        
        JTextField tf1= new JTextField(10);
        JTextField tf2= new JTextField(10);
        JPasswordField p1= new JPasswordField(8);
      
        JRadioButton rd1= new JRadioButton("Male");
        JRadioButton rd2= new JRadioButton("Female");

        JCheckBox ck1= new JCheckBox("C++");
        JCheckBox ck2= new JCheckBox("Python");
      
        JLabel add1= new JLabel("Address");
        JTextArea adr2= new JTextArea(50,50);
        JButton bt1= new JButton("Submit");

        ButtonGroup bg= new ButtonGroup();
        bg.add(rd1);
        bg.add(rd2);    
  
        
        JPanel j1= new JPanel();
        JPanel j2= new JPanel();
        JPanel j3= new JPanel();
        JPanel r1= new JPanel();
        JPanel chk1= new JPanel();        
   
        j1.add(name);
        j1.add(tf1);
        j2.add(mail);
        j2.add(tf2);
        j3.add(pass);
        j3.add(p1);
        r1.add(rd1);
        r1.add(rd2);        
        chk1.add(ck1);
        chk1.add(ck2);  
    

        j1.setBounds(4,10,300,30);
        j2.setBounds(6,45,300,30);
        j3.setBounds(8,75,300,30);
        r1.setBounds(55,100,140,30);
        chk1.setBounds(55,125,140,30);
        add1.setBounds(55,155,100,50);        
        adr2.setBounds(55,195,150,40);
        bt1.setBounds(55,245,200,30);        

        frame.add(j1);
        frame.add(j2); 
        frame.add(j3);
        frame.add(r1);
        frame.add(chk1);      
        frame.add(add1); 
        frame.add(adr2);
        frame.add(bt1);

        frame.setLayout(null);
        frame.setSize(300,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}