import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SalaryCalculatorGUI extends JFrame {
    private JTextField hoursField, rateField;
    private JTextArea resultArea;
    private int employeeCount = 0;
    private final int NUM_EMPLOYEES = 3;  // Number of employees to process

    public SalaryCalculatorGUI() {
        setTitle("Salary Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 5, 5));

        add(new JLabel("Enter Hours Worked:"));
        hoursField = new JTextField();
        add(hoursField);

        add(new JLabel("Enter Hourly Rate:"));
        rateField = new JTextField();
        add(rateField);

        JButton calculateButton = new JButton("Calculate");
        add(calculateButton);

        resultArea = new JTextArea();
        resultArea.setEditable(false);
        add(new JScrollPane(resultArea));

        // Button Action Listener
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateSalary();
            }
        });

        setVisible(true);
    }

    private void calculateSalary() {
        try {
            if (employeeCount >= NUM_EMPLOYEES) {
                resultArea.append("\nAll employees processed.");
                return;
            }

            int hoursWorked = Integer.parseInt(hoursField.getText());
            double hourlyRate = Double.parseDouble(rateField.getText());

            double grossPay;
            if (hoursWorked > 40) {
                grossPay = (40 * hourlyRate) + ((hoursWorked - 40) * hourlyRate * 1.5);
            } else {
                grossPay = hoursWorked * hourlyRate;
            }

            employeeCount++;
            resultArea.append("Employee " + employeeCount + " Gross Pay: $" + String.format("%.2f", grossPay) + "\n");

            hoursField.setText("");  // Clear input fields
            rateField.setText("");

            if (employeeCount == NUM_EMPLOYEES) {
                resultArea.append("\nAll employees processed.\n");
            }

        } catch (NumberFormatException ex) {
            resultArea.setText("Invalid input! Please enter numbers.");
        }
    }

    public static void main(String[] args) {
        new SalaryCalculatorGUI();
    }
}
