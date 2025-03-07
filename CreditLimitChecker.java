import java.util.Scanner;

public class CreditLimitChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== Credit Limit Checker ===");
        System.out.println("Enter -1 as the account number to exit.\n");

        while (true) {
            System.out.print("Enter account number (-1 to quit): ");
            int accountNumber = scanner.nextInt();
            if (accountNumber == -1) break; // Exit condition

            System.out.print("Enter beginning balance: ");
            int beginningBalance = scanner.nextInt();

            System.out.print("Enter total charges this month: ");
            int charges = scanner.nextInt();

            System.out.print("Enter total credits this month: ");
            int credits = scanner.nextInt();

            System.out.print("Enter allowed credit limit: ");
            int creditLimit = scanner.nextInt();

            // Calculate new balance
            int newBalance = beginningBalance + charges - credits;
            System.out.println("\nAccount Number: " + accountNumber);
            System.out.println("New Balance: $" + newBalance);

            // Check if credit limit is exceeded
            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded!\n");
            } else {
                System.out.println("Credit limit not exceeded.\n");
            }
        }

        System.out.println("Program terminated.");
        scanner.close();
    }
}
