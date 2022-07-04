import java.util.Scanner;

public class MoneyInvestment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money, interestRate;
        byte month;
        System.out.println("Enter your money value:");
        money = scanner.nextDouble();
        System.out.println("Enter your interest rate:");
        interestRate = scanner.nextDouble();
        System.out.println("Enter your month value:");
        month = scanner.nextByte();
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.println("Total of interest: "+totalInterest);
    }
}
