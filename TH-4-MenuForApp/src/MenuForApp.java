import java.util.Scanner;

public class MenuForApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -8;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Draw the triangle");
                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j < 6; j++) {
                            System.out.println("*");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Draw the square");
                    for (int i = 0; i < 6; i++) {
                        System.out.println("*");
                    }
                    break;
            }
        }
    }
}
