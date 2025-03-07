import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int NUM_EMPLOYEES = 3;

        for (int i = 1; i <= NUM_EMPLOYEES; i++) {
            System.out.println("\nEnter details for Employee " + i + ":");

            System.out.print("Enter hours worked: ");
            int hoursWorked = scanner.nextInt();

            System.out.print("Enter hourly rate: ");
            double hourlyRate = scanner.nextDouble();

            double grossPay;

            if (hoursWorked > 40) {
                grossPay = (40 * hourlyRate) + ((hoursWorked - 40) * hourlyRate * 1.5);
            } else {
                grossPay = hoursWorked * hourlyRate;
            }

            System.out.printf("Employee %d - Gross Pay: $%.2f\n", i, grossPay);
        }

        scanner.close();
    }
}
// The SalaryCalculator program calculates the gross pay for each of three employees based on the hours worked and hourly rate entered by the user. The program uses a for loop to prompt the user for employee details three times. The program uses a Scanner object to read input from the user. The program defines a constant NUM_EMPLOYEES to store the number of employees. The program prompts the user to enter the hours worked and hourly rate for each employee. The program calculates the gross pay for each employee based on the hours worked and hourly rate. The program uses an if-else statement to calculate the gross pay, taking into account overtime pay for hours worked over 40. The program uses the printf method to format the output with two decimal places. The program closes the Scanner object after reading all input from the user. The program displays the gross pay for each employee. The program increments the employee number for each iteration of the for loop. The program uses a for loop to prompt the user for employee details three times. The program imports the java.util.Scanner class for user input. The program defines a constant NUM_EMPLOYEES to store the number of employees. The program defines variables to store the hours worked, hourly rate, and gross pay for each employee. The program initializes the gross pay to zero. The program prompts the user to enter the hours worked and hourly rate for each employee. The program calculates the gross pay for each employee based on the hours worked and hourly rate. The program uses an if-else statement to calculate the gross pay, taking into account overtime pay for hours worked over 40. The program uses the printf method to format the output with two decimal places. The program closes the Scanner object after reading all input from the user. The program displays the gross pay for each employee. The program increments the employee number for each iteration of the for loop. The program uses a for loop to prompt the user for employee details three times. The program imports the java.util.Scanner class for user input. The program defines a constant NUM_EMPLOYEES to store the number of employees. The program defines variables to store the hours worked, hourly rate, and gross pay for each employee. The program initializes the gross pay to zero. The program prompts the user to enter the hours worked and hourly rate for each employee. The program calculates the gross pay for each employee based on the hours worked and hourly rate. The program uses an if-else statement to calculate the gross pay, taking