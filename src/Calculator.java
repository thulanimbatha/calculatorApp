import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {

    JFrame frame;
    JTextField textField;
    JButton[] numberButtons = new JButton[10];  //Array of buttons for the numbers, size=10
    JButton[] functionButtons = new JButton[8]; //Array of buttons for the operators
    /*Now let's list all the function buttons*/
    JButton addButton,subtractButton,multButton,divButton;
    JButton decimalButton,equalsButton,deleteButton,clearButton;
    /*JPanel to hold all the buttons*/
    JPanel panel;

    Font myFont = new Font("Times New Roman", Font.BOLD,30);

    //Calculator will always work using at least 3 values & 1 operator
    double num1=0,num2=0,result=0;
    char operator;

    public Calculator() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,550);
        frame.setLayout(null);

        textField = new JTextField();
        textField.setBounds(50,25,300,50);
        textField.setFont(myFont);

        frame.add(textField);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
