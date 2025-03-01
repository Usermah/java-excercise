import java.util.Scanner;
public class Test{
public static void main(String[] args){

// System.out.printf("%s%n%s%n%s%n", "Welcome to", "Java Programming! ", "usama");

Scanner input = new Scanner(System.in);
// System.out.print("Please Enter the first number: ");
// int num1 = input.nextInt();
// System.out.print("Please Enter the second number: ");
// int num2 = input.nextInt();
// int sum = num1 + num2 ;
// System.out.print(sum);
// System.out.printf("Sum is: %d%n", sum);

// if (num1 == num2) 
//     System.out.printf("%d == %d%n", num1, num2);

// if (num1 != num2)
//     System.out.printf("%d != %d%n", num1, num2);

// if(num1 < num2)
//     System.out.printf("%d < %d%n", num1, num2);

// if(num1 > num2)
//     System.out.printf("%d > %d%n", num1, num2);

// if(num1 <= num2)
//     System.out.printf("%d <= %d%n", num1, num2);

// if(num1 >= num2)
// System.out.printf("%d >= %d%n", num1, num2);

// System.out.println("=================================================");
    
    


// JOptionPane.showMessageDialog(null, "welcome to computer science! ");

// JFrame frame = new JFrame("Example");
// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// frame.setSize(300, 300);
// String name = JOptionPane.showInputDialog(frame, "Enter your name");
// String message = String.format("Welcome, %s, to tutorial", name);
// JOptionPane.showMessageDialog(frame, message);
// frame.dispose();

// System.out.println("=================================================");
        // JFrame frame = new JFrame("Example");
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setSize(300, 300);
        // frame.setLayout(null); 
        // JButton button = new JButton("Click Me");
        // button.setBounds(80, 100, 140, 40); 
        // button.addActionListener(e -> {

        //     String name = JOptionPane.showInputDialog(frame, "Enter your name");
        //     if (name != null && !name.trim().isEmpty()) {  
        //         String message = String.format("%s, Welcome to the tutorial", name);
        //         JOptionPane.showMessageDialog(frame, message);
        //     } else {
        //         JOptionPane.showMessageDialog(frame, "You didn't enter a name!", "Warning", JOptionPane.WARNING_MESSAGE);
        //     }
        // });
        // frame.add(button);
        // frame.setVisible(true);
    


// System.out.println("=================================================");
// JFrame frame = new JFrame("Frame Example");
// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// frame.setSize(300,300);
// JButton button = new JButton("click me");
// button.addActionListener(e -> JOptionPane.showMessageDialog(button, "You are welcome"));
// frame.add(button);
// frame.setVisible(true);

   
     
//System.out.println("=================================================");
       

// int num, max, min;
// System.out.print("Enter an Integer: ");
// num = input.nextInt();
// min = max = num;
// for(int i =1; i < 5; i++){
//     System.out.print("Enter another number: ");
//     num = input.nextInt();
//     if(num < min){
//         min = num;
//     }
//     if(num > max){
//         max = num;

//     }

// }
// System.out.println("The largest number is: " + max);
// System.err.println("The smallest number is: " + min);
// input.close();

// System.out.println("=================================================");

// int n1 =0 , n2 =  0, check = 0;

// for(int i = 0; i < 5; i++){
// System.out.print("Enter any number: ");
// check = input.nextInt();
// if(check % 2 == 0){
//     n1++;
// }else{
//     n2++;
    
// }
// }
// System.out.printf("You Enter %d EVEN number: ", n1);
// System.out.printf(", You Enter %d ODD number", n2);
// input.close();

// System.out.println("=================================================");

// System.out.println("Enter the first number: ");
// int f1 = input.nextInt();
// System.out.println("Enter the second number: ");
// int f2 = input.nextInt();
// if (f2 != 0 && f1 % f2 ==0) {
//     System.out.print("First number is a multiple of second number.");
    
// } else {
//     System.out.print("First number is not a multiple of second number.");
// }
// input.close();
// System.out.println("=================================================");

// diameter = 2r
// circumference = 2πr
// area = πr2

// double radius, diameter, circumference, area;
// System.out.printf("Enter the radius: ");
// radius = input.nextInt();
// diameter = 2 * radius;
// circumference = 2 * Math.PI * radius;
// area = Math.PI * (radius * radius);

// System.out.println("=================================================");

// System.out.println("The diameter of the circle is  " + diameter);
// System.out.printf("The circumference of the circle is: %f", circumference);
// System.out.printf("The area of the circle is: %f" , area);


// System.out.println("=================================================");

    // System.out.printf("the character %c has the value %d%n", 'A', ((int)'A'));
    // System.out.printf("the character %c has the value %d%n", 'B', ((int)'B'));
    // System.out.printf("the character %c has the value %d%n", 'C', ((int)'C'));
    // System.out.printf("the character %c has the value %d%n", 'a', ((int)'a'));
    // System.out.printf("the character %c has the value %d%n", 'b', ((int)'b'));
    // System.out.printf("the character %c has the value %d%n", 'c', ((int)'c'));
    // System.out.printf("the character %c has the value %d%n", '0', ((int)'0'));
    // System.out.printf("the character %c has the value %d%n", '1', ((int)'1'));
    // System.out.printf("the character %c has the value %d%n", ' ', ((int)' '));
    

// System.out.println("=================================================");
// System.out.print("Enter five digit number: ");
// int number = input.nextInt();
// if(number < 10000 || number > 99999){
//     System.out.println("Error: Please enter a valid five-digit number. ");
// }
// else{
//     int digit1 = number/ 10000;
//     int digit2 = (number / 1000) % 10;
//     int digit3 = (number / 100) % 10;
//     int digit4 = (number / 10) % 10;
//     int digit5 = number % 10;

//     System.out.println(digit1 + "   " + digit2 + "   " + digit3 + "   " + digit4 + "   " + digit5);


// System.out.println("=================================================");

// System.out.println("Number\tSquare\tCube");
// for(int i = 0; i <= 10; i++){
//     System.out.println(i + "\t" + (i * i) + "\t" + (i * i * i));
// }

// System.out.println("=================================================");

// int negative = 0;
// int positive = 0;
// int zeros = 0;

// System.out.println("Enter five numbers");
// for(int i = 0; i < 5; i++){
//     System.out.print("Enter another number: ");
// int number = input.nextInt();
// if (number < 0){
//     negative++;
// }
// else if(number > 0){
//     positive++;
// }
// else{
//     zeros++;
// }
// }
// System.out.println("Positive number: " + positive);
// System.out.println("Negative number: " + negative);
// System.out.println("Zeros: " + zeros);

// input.close();
// System.out.println("=================================================");

// System.out.print("Enter weight (kg): ");
// double weight = input.nextDouble();

// System.out.print("Enter height (h): ");
// Double  height = input.nextDouble();

// double bmi = weight / (height * height);
// System.out.printf("Your  BMI: %.2f%n", bmi);
// System.out.println("BMI VALUES");
// System.out.println("Underweight: less than 18.5");
// System.out.println("Normal: between 18.5 and 24.9");
// System.out.println("Overweight: between 25 and 29.9");
// System.out.print("Obese: 30 or greater");

// input.close();

// System.out.print("Enter current world population: ");
// long population = input.nextLong();
// System.out.print("Enter Annual growth rate (as a parcentage): ");
// double growthRate = input.nextDouble();
// System.out.println("Estimate world population for the next five years: ");
// population += (population * growthRate / 100);
// for(int year = 1; year <= 5; year++){
    
//     System.out.println("year " + year + " : " + population);
// }
// input.close();

// System.out.print("Enter total mile driving per day: ");
// double milePerDay = input.nextDouble();
// System.out.print("Enter cost per gallon of gasoline: ");
// double costPerGallon = input.nextDouble();
// System.out.print("Enter average miles per gallon:: ");
// double milePerGallon = input.nextDouble();
// System.out.print("Enter packing fees per day: ");
// double parkingFees = input.nextDouble();
// System.out.print("Enter tolls per day: ");
// double tolls = input.nextDouble();

// double dailyCost = (milePerDay / milePerGallon) * (costPerGallon + parkingFees + tolls);
// System.out.printf("your daily driving cost: $%.2f%n", dailyCost);

// input.close();

}
}


