import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MileageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalMiles = 0;
        int totalGallons = 0;
        int tripNumber = 1;
        int miles, gallons;

        // File setup
        try (PrintWriter writer = new PrintWriter(new FileWriter("mileage_log.txt", true))) {
            System.out.println("\n=== Mileage Calculator ===");
            System.out.println("Enter -1 to quit at any time.\n");

            while (true) {
                System.out.print("Enter miles driven (-1 to quit): ");
                miles = scanner.nextInt();
                
                if (miles == -1) break; // Exit condition

                System.out.print("Enter gallons used: ");
                gallons = scanner.nextInt();

                if (gallons <= 0) {
                    System.out.println("Invalid input! Gallons must be greater than zero. Try again.");
                    continue;
                }

                // Calculate MPG for this trip
                double mpg = (double) miles / gallons;
                System.out.printf("Trip %d - Miles per gallon: %.2f\n", tripNumber, mpg);

                // Update totals
                totalMiles += miles;
                totalGallons += gallons;
                double totalMpg = (double) totalMiles / totalGallons;

                System.out.printf("Overall MPG so far: %.2f\n\n", totalMpg);

                // Save trip data to file
                writer.printf("Trip %d - Miles: %d, Gallons: %d, MPG: %.2f, Overall MPG: %.2f\n",
                              tripNumber, miles, gallons, mpg, totalMpg);
                tripNumber++;
            }

            System.out.println("\nData saved to mileage_log.txt. Program terminated.");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }

        scanner.close();
    }
}
// The MileageCalculator program calculates the miles per gallon (MPG) for each trip and the overall MPG. The user enters the miles driven and gallons used for each trip. The program saves the trip data to a file named mileage_log.txt. The program continues to prompt the user for trip data until the user enters -1 for the miles driven. The program handles invalid input for gallons used and displays an error message. The program uses a try-with-resources block to automatically close the PrintWriter after writing to the file. The program catches and handles IOExceptions that may occur during file writing. The program displays a message indicating that the data has been saved to the file when the user exits the program. The program uses the printf method to format the output with two decimal places. The program calculates the overall MPG by summing the total miles and gallons for all trips and dividing the total miles by the total gallons. The program increments the trip number for each trip and includes it in the trip data saved to the file. The program uses a while loop to continue prompting the user for trip data until the user enters -1 for the miles driven. The program uses a Scanner object to read input from the user. The program imports the java.io.FileWriter, java.io.IOException, and java.io.PrintWriter classes for file writing. The program imports the java.util.Scanner class for user input. The program defines variables to store the total miles, total gallons, trip number, miles driven, and gallons used. The program initializes the total miles, total gallons, and trip number to zero. The program defines a try-with-resources block to create a PrintWriter object for writing to the file. The program prompts the user to enter the miles driven and gallons used for each trip. The program calculates the MPG for each trip by dividing the miles driven by the gallons used. The program updates the total miles and total gallons with the values entered by the user. The program calculates the overall MPG by dividing the total miles by the total gallons. The program saves the trip data to the file using the PrintWriter object. The program catches and handles IOExceptions that may occur during file writing. The program closes the Scanner object after reading all input from the user. The program displays an error message if an IOException occurs during file writing. The program displays a message indicating that the data has been saved to the file when the user exits the program. The program uses the printf method to format the output with two decimal places. The program increments the trip number