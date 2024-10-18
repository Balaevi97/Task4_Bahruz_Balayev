import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("გთხოვთ შეიყვანოთ დადებითი რიცხვი: ");
        int input = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(" 5 * " + i + " = " + input * i);
        }
    }
}
