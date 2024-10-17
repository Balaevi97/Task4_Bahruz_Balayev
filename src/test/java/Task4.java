import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("შეიყვანეთ დადებითი რიცხვი");
        int costumerAnswer = scanner.nextInt();
        int staticNumber = 2;

        while (staticNumber <= costumerAnswer) {
            int sum = 0;

            for (int i = 2; i <= costumerAnswer; i += 2) {
                sum += i;
            }
            System.out.println("ლუწი რიცხვების ჯამი 1 და " + costumerAnswer + "-მდე არის: " + sum);
            System.out.println("შეიყვანეთ ახალი დადებითი რიცხვი");
            costumerAnswer = scanner.nextInt();

        }
        System.out.println("თქვენს მიერ შეყვანილი მნიშვნელობა ნაკლებია მინიმალურ მნიშვნელობაზე. პროცესის დასრულდა!");

    }
}
