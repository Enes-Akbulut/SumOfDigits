import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, result = 0, digitN;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number : ");
        number = input.nextInt();

        while (number != 0) {
            digitN = number % 10;
            result += digitN;
            number /= 10;
        }
        System.out.println(result);

    }
}