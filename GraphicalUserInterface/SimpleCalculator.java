import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends JFrame implements ActionListener {
    JTextField input1, input2, result;
    JButton add, sub, mul, div;

    public SimpleCalculator() {
        setTitle("Simple Calculator");
        setSize(300, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 10, 10));

        // Create components
        input1 = new JTextField();
        input2 = new JTextField();
        result = new JTextField();
        result.setEditable(false);

        add = new JButton("Add");
        sub = new JButton("Subtract");
        mul = new JButton("Multiply");
        div = new JButton("Divide");

        // Add action listeners
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        // Add components to the frame
        add(new JLabel("First Number:"));
        add(input1);
        add(new JLabel("Second Number:"));
        add(input2);
        add(add);
        add(sub);
        add(mul);
        add(div);
        add(new JLabel("Result:"));
        add(result);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(input1.getText());
            double num2 = Double.parseDouble(input2.getText());
            double res = 0;

            if (e.getSource() == add) {
                res = num1 + num2;
            } else if (e.getSource() == sub) {
                res = num1 - num2;
            } else if (e.getSource() == mul) {
                res = num1 * num2;
            } else if (e.getSource() == div) {
                if (num2 == 0) {
                    result.setText("Cannot divide by 0");
                    return;
                }
                res = num1 / num2;
            }

            result.setText(String.valueOf(res));
        } catch (NumberFormatException ex) {
            result.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}
