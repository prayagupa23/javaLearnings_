import javax.swing.JFrame;
import javax.swing.JLabel;
class demo{
    public static void main(String args[]){
        JFrame gui= new JFrame("JFrame demo");
        JLabel label1= new JLabel("Hi this is me, Prayag!");
        gui.add(label1);
        gui.setSize(450,500);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
    }
}
