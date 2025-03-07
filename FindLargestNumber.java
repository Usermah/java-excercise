import java.util.Scanner;

public class FindLargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        int counter = 0;

        while (counter < 10) {
            System.out.print("Enter number " + (counter + 1) + ": ");
            int number = scanner.nextInt();

            if (number > largest) {
                largest = number;
            }

            counter++;
        }

        System.out.println("The largest number entered is: " + largest);
        scanner.close();
    }
}
