import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleCalculator {
    private JFrame frame;
    private JTextField display;
    private StringBuilder currentInput;

    public SimpleCalculator() {
        frame = new JFrame("Simple Calculator");
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        currentInput = new StringBuilder();

        // Display area
        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.PLAIN, 24));
        frame.add(display, BorderLayout.NORTH);

        // Panel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        // Create buttons for digits and operators
        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };

        // Add buttons to the panel
        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.PLAIN, 20));
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }

        frame.add(buttonPanel, BorderLayout.CENTER);
    }

    // Action listener for button clicks
    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.charAt(0) == '=') {
                // Evaluate expression
                try {
                    String result = evaluateExpression(currentInput.toString());
                    display.setText(result);
                    currentInput.setLength(0);  // Clear input for next calculation
                } catch (Exception ex) {
                    display.setText("Error");
                    currentInput.setLength(0);  // Clear input
                }
            } else {
                // Add the clicked button's label to current input
                currentInput.append(command);
                display.setText(currentInput.toString());
            }
        }
    }

    // Method to evaluate the mathematical expression
    private String evaluateExpression(String expression) {
        double result = 0;
        try {
            String[] tokens = expression.split(" ");
            double num1 = Double.parseDouble(tokens[0]);
            String operator = tokens[1];
            double num2 = Double.parseDouble(tokens[2]);

            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        throw new ArithmeticException("Cannot divide by zero");
                    }
                    result = num1 / num2;
                    break;
            }
        } catch (Exception e) {
            throw new ArithmeticException("Invalid Expression");
        }

        return String.valueOf(result);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SimpleCalculator calculator = new SimpleCalculator();
            calculator.frame.setVisible(true);
        });
    }
}