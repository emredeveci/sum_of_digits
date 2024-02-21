import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //variable declarations
        int number = 0, total = 0;

        //scanner initialization and user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        number = scanner.nextInt();

        //calculating the sum of all digits of an integer
        while (number > 0) {
            System.out.println(number % 10);
            total = total + (number % 10);
            number /= 10;
        }

        System.out.println("The sum of all digits of your number is: " + total);
    }
}