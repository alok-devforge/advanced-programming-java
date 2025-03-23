import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class E_SimpleCalculator extends JFrame implements ActionListener
{
    
    private JTextField tfNum1, tfNum2, tfResult;
    private JButton btnAdd, btnSubtract, btnMultiply, btnDivide;
    public E_SimpleCalculator()
    {
        setTitle("Simple Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLayout(new GridLayout(3, 1));

        JPanel inputPanel = new JPanel(new FlowLayout());
        inputPanel.add(new JLabel("Number 1:"));
        tfNum1 = new JTextField(10);
        inputPanel.add(tfNum1);
        inputPanel.add(new JLabel("Number 2:"));
        tfNum2 = new JTextField(10);
        inputPanel.add(tfNum2);
        
        JPanel buttonPanel = new JPanel(new FlowLayout());
        btnAdd = new JButton("+");
        btnAdd.addActionListener(this);
        btnSubtract = new JButton("-");
        btnSubtract.addActionListener(this);
        btnMultiply = new JButton("*");
        btnMultiply.addActionListener(this);
        btnDivide = new JButton("/");
        btnDivide.addActionListener(this);
        buttonPanel.add(btnAdd);
        buttonPanel.add(btnSubtract);
        buttonPanel.add(btnMultiply);
        buttonPanel.add(btnDivide);
        
        JPanel resultPanel = new JPanel(new FlowLayout());
        resultPanel.add(new JLabel("Result:"));
        tfResult = new JTextField(20);
        tfResult.setEditable(false);
        resultPanel.add(tfResult);

        add(inputPanel);
        add(buttonPanel);
        add(resultPanel);
        
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        double num1, num2, result = 0;
        try {
            num1 = Double.parseDouble(tfNum1.getText());
            num2 = Double.parseDouble(tfNum2.getText());
        } catch (NumberFormatException ex) {
            tfResult.setText("Invalid Input");
            return;
        }
        
        if (e.getSource() == btnAdd) {
            result = num1 + num2;
        } else if (e.getSource() == btnSubtract) {
            result = num1 - num2;
        } else if (e.getSource() == btnMultiply) {
            result = num1 * num2;
        } else if (e.getSource() == btnDivide) {
            if (num2 == 0) {
                tfResult.setText("Division by zero");
                return;
            }
            result = num1 / num2;
        }
        tfResult.setText(Double.toString(result));
    }
    
    public static void main(String[] args)
    {
        new E_SimpleCalculator();
    }
}