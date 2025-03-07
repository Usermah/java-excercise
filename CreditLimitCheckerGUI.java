import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CreditLimitCheckerGUI extends JFrame {
    private JTextField accountField, balanceField, chargesField, creditsField, limitField;
    private JTextArea resultArea;

    public CreditLimitCheckerGUI() {
        setTitle("Credit Limit Checker");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2, 5, 5));

        // Labels and Text Fields
        add(new JLabel("Account Number:"));
        accountField = new JTextField();
        add(accountField);

        add(new JLabel("Beginning Balance:"));
        balanceField = new JTextField();
        add(balanceField);

        add(new JLabel("Total Charges:"));
        chargesField = new JTextField();
        add(chargesField);

        add(new JLabel("Total Credits:"));
        creditsField = new JTextField();
        add(creditsField);

        add(new JLabel("Credit Limit:"));
        limitField = new JTextField();
        add(limitField);

        // Button
        JButton checkButton = new JButton("Check Credit");
        add(checkButton);

        // Result Area
        resultArea = new JTextArea();
        resultArea.setEditable(false);
        add(new JScrollPane(resultArea));

        // Button Action Listener
        checkButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                checkCreditLimit();
            }
        });

        setVisible(true);
    }

    private void checkCreditLimit() {
        try {
            int accountNumber = Integer.parseInt(accountField.getText());
            int beginningBalance = Integer.parseInt(balanceField.getText());
            int charges = Integer.parseInt(chargesField.getText());
            int credits = Integer.parseInt(creditsField.getText());
            int creditLimit = Integer.parseInt(limitField.getText());

            // Calculate new balance
            int newBalance = beginningBalance + charges - credits;

            // Generate result message
            String result = "Account Number: " + accountNumber + "\n"
                          + "New Balance: $" + newBalance + "\n";

            if (newBalance > creditLimit) {
                result += "Credit limit exceeded!\n";
            } else {
                result += "Credit limit not exceeded.\n";
            }

            resultArea.setText(result);
        } catch (NumberFormatException ex) {
            resultArea.setText("Invalid input! Please enter numbers only.");
        }
    }

    public static void main(String[] args) {
        new CreditLimitCheckerGUI();
    }
}
