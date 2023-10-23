package Day_4;

import java.util.Scanner;

public class SimpleMathHelper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the simple math helper.");
        System.out.println("What would you like to calculate?");
        System.out.println("1. Sqrt");
        System.out.println("2. Log");
        System.out.println("3. Factorial");
        System.out.print("> ");
        
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                System.out.print("Enter the number to sqrt: ");
                double numberSqrt = scanner.nextDouble();
                double sqrtResult = Math.sqrt(numberSqrt);
                System.out.println("Result: " + sqrtResult);
                break;
                
            case 2:
                System.out.print("Enter the number to take log: ");
                double numberLog = scanner.nextDouble();
                double logResult = Math.log(numberLog);
                System.out.println("Result: " + logResult);
                break;
                
            case 3:
                System.out.print("Enter the number to calculate factorial: ");
                int numberFactorial = scanner.nextInt();
                int factorialResult = calculateFactorial(numberFactorial);
                System.out.println("Result: " + factorialResult);
                break;
                
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
        
        scanner.close();
    }
    
    public static int calculateFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        } else {
            return number * calculateFactorial(number - 1);
        }
    }
}
