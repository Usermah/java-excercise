import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SalesCommissionCalculator extends JFrame {
    private JTextField itemField;
    private JTextArea resultArea;
    private double totalSales = 0;
    
    // Item prices
    private final double[] itemPrices = {239.99, 129.75, 339.94, 690.83};

    public SalesCommissionCalculator() {
        setTitle("Sales Commission Calculator");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1, 5, 5));

        // Instruction Label
        add(new JLabel("Enter item number sold (1-4), or -1 to finish:"));

        // Input Field
        itemField = new JTextField();
        add(itemField);

        // Button to add item
        JButton addItemButton = new JButton("Add Item");
        add(addItemButton);

        // Result Area
        resultArea = new JTextArea();
        resultArea.setEditable(false);
        add(new JScrollPane(resultArea));

        // Button Action Listener
        addItemButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addItem();
            }
        });

        setVisible(true);
    }

    private void addItem() {
        try {
            int itemNumber = Integer.parseInt(itemField.getText());

            if (itemNumber == -1) {
                calculateEarnings();
                return;
            }

            if (itemNumber < 1 || itemNumber > 4) {
                resultArea.setText("Invalid item! Enter a number between 1 and 4.");
                return;
            }

            // Add item price to total sales
            totalSales += itemPrices[itemNumber - 1];
            resultArea.setText("Item " + itemNumber + " added. Total Sales: $" + String.format("%.2f", totalSales));
        } catch (NumberFormatException ex) {
            resultArea.setText("Invalid input! Enter a valid item number.");
        }
    }

    private void calculateEarnings() {
        double baseSalary = 200;
        double commission = totalSales * 0.09;
        double totalEarnings = baseSalary + commission;

        resultArea.setText("Total Sales: $" + String.format("%.2f", totalSales) +
                           "\nCommission: $" + String.format("%.2f", commission) +
                           "\nTotal Earnings: $" + String.format("%.2f", totalEarnings));
    }

    public static void main(String[] args) {
        new SalesCommissionCalculator();
    }
}
