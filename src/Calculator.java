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
        /*instantiate frame*/
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,550);
        frame.setLayout(null);

        /*Instantiate textField*/
        textField = new JTextField();
        textField.setBounds(50,25,300,50);
        textField.setFont(myFont);
        textField.setEditable(false);   //user cannot input into textField - we only want to output

        /*instantiate buttons*/
        addButton = new JButton("+");
        subtractButton = new JButton("-");
        multButton = new JButton("*");
        divButton = new JButton("/");
        decimalButton = new JButton(".");
        equalsButton = new JButton("=");
        deleteButton = new JButton("Delete");
        clearButton = new JButton("Clear");
        /*add them to the buttons array*/
        functionButtons[0] = addButton;
        functionButtons[1] = subtractButton;
        functionButtons[2] = multButton;
        functionButtons[3] = divButton;
        functionButtons[4] = decimalButton;
        functionButtons[5] = equalsButton;
        functionButtons[6] = deleteButton;
        functionButtons[7] = clearButton;
        /*we want an ActionListener for each button*/
        for(int i = 0; i<8; i++){
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(myFont);
            functionButtons[i].setFocusable(false);
        }

        /*Now we need to fill the numberButtons array*/
        for(int i = 0; i<10; i++){
            numberButtons[i] = new JButton(String.valueOf(i));  //fill array
            numberButtons[i].addActionListener(this);       //actionListener for each button
            numberButtons[i].setFont(myFont);               //font
            numberButtons[i].setFocusable(false);
        }

        /*These two buttons will look different to the others*/
        deleteButton.setBounds(50,430,145,50);
        clearButton.setBounds(205,430,145,50);

        frame.add(deleteButton);    //add delete button
        frame.add(clearButton);     //add clear button
        frame.add(textField);   //add textField to frame
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
