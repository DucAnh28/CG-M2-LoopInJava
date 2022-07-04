import java.util.Scanner;

public class CommonFactor {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number a");
        a = scanner.nextInt();
        System.out.println("Enter your number b");
        b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0){
            System.out.println("No greatest common factor");
        } else {
            while (a != b){
                if (a>b){
                    a = a - b;
                }
                else {
                    b = b - a;
                }
            }
        }
    }
}
