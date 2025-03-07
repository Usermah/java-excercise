import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FindLargestNumberGUI extends JFrame {
    private JTextField numberField;
    private JTextArea resultArea;
    private int largest = Integer.MIN_VALUE;
    private int counter = 0;

    public FindLargestNumberGUI() {
        setTitle("Find Largest Number");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1, 5, 5));

        add(new JLabel("Enter a number:"));
        numberField = new JTextField();
        add(numberField);

        JButton enterButton = new JButton("Enter Number");
        add(enterButton);

        resultArea = new JTextArea();
        resultArea.setEditable(false);
        add(new JScrollPane(resultArea));

        enterButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                findLargest();
            }
        });

        setVisible(true);
    }

    private void findLargest() {
        try {
            if (counter >= 10) {
                resultArea.append("\n10 numbers entered. Largest: " + largest);
                return;
            }

            int number = Integer.parseInt(numberField.getText());

            if (number > largest) {
                largest = number;
            }

            counter++;
            resultArea.append("Number " + counter + ": " + number + "\n");

            numberField.setText("");

            if (counter == 10) {
                resultArea.append("\nLargest Number: " + largest);
            }

        } catch (NumberFormatException ex) {
            resultArea.setText("Invalid input! Please enter a number.");
        }
    }

    public static void main(String[] args) {
        new FindLargestNumberGUI();
    }
}
