import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends Frame {
    private TextField displayField;

    private String currentInput = "";

    private double firstOperand = 0;

    
    private char selectedOperator = ' ';

    public SimpleCalculator() {
        setLayout(new BorderLayout());

        displayField = new TextField();
        displayField.setEditable(false);
        add(displayField, BorderLayout.NORTH);

        
        Panel buttonPanel = new Panel();
        buttonPanel.setLayout(new GridLayout(4, 4, 5, 5));

        
        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for (String label : buttonLabels) {
            Button button = new Button(label);
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }

        
        add(buttonPanel, BorderLayout.CENTER);

        
        setTitle("Simple Calculator");
        setSize(300, 300);
        setVisible(true);
        setResizable(false);

        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose(); 
            }
        });
    }

    
    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Button source = (Button) e.getSource();
            String buttonText = source.getLabel();

            
            if (Character.isDigit(buttonText.charAt(0)) || buttonText.equals(".")) {
                currentInput += buttonText;
                displayField.setText(currentInput);
            }

            
            else if (buttonText.equals("+") || buttonText.equals("-") ||
                    buttonText.equals("*") || buttonText.equals("/")) {
                if (!currentInput.isEmpty()) {
                    firstOperand = Double.parseDouble(currentInput);
                    selectedOperator = buttonText.charAt(0);
                    currentInput = "";
                }
            }

            
            else if (buttonText.equals("=")) {
                if (!currentInput.isEmpty()) {
                    double secondOperand = Double.parseDouble(currentInput);
                    double result = performOperation(firstOperand, secondOperand, selectedOperator);
                    displayField.setText(Double.toString(result));
                    currentInput = "";
                }
            }
        }
    }

    
    private double performOperation(double operand1, double operand2, char operator) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                if (operand2 != 0) {
                    return operand1 / operand2;
                } else {
                    System.out.println("Error: Division by zero");
                    return Double.NaN; 
                }
            default:
                return 0; 
        }
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}
