import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int numberIn = scanner.nextInt();
        if (numberIn < 2) {
            System.out.println(numberIn + "Is not a prime number");
        }
        boolean isPrime1 = true;
        int i = 2;
        while (i <= Math.sqrt(numberIn)) {
            if (numberIn % i == 0) {
                isPrime1 = false;
                break;
            }
            i++;
        }
        if (isPrime1 == true) {
            System.out.println(numberIn + " is a prime number");
        } else {
            System.out.println(numberIn + " is not a prime number");
        }
    }
}

