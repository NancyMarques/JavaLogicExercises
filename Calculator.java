import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Select operation: ");
        System.out.println("1. Addition(+)");
        System.out.println("2. Subtraction(-)");
        System.out.println("3. Multiplication(*)");
        System.out.println("4. Division(/)");

        System.out.println("Select your choice(1/2/3/4)");
        int choice = scanner.nextInt();

        double result = 0.0;

        switch (choice){
            case 1:
                result = num1 + num2;
                System.out.println(result);
                break;

            case 2:
                result = num1 - num2;
                System.out.println(result);
                break;
            case 3:
                result = num1*num2;
                System.out.println(result);
                break;
            case 4:
                if(num2 !=0){
                    result = num1/num2;
                    System.out.println(result);
                    break;
                } else {
                    System.out.println("Error: division by 0 is not allowed.");
                }

            default:
                System.out.println("Invalid operation choice.");
        }
    }
}
