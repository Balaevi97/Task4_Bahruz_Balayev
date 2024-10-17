import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("შეიყვანეთ თქვენს მიერ დაგროვებული საბოლოო ქულა");

        int studentPoint = scanner.nextInt();
        if (studentPoint >= 90 && studentPoint <= 100 ) {
            System.out.println(" You get grade A ");
        } else if (studentPoint >= 80 && studentPoint <= 89 ) {
            System.out.println(" You get grade B ");
        } else if (studentPoint >= 70 && studentPoint <= 79 ) {
            System.out.println(" You get grade C ");
        } else if (studentPoint >= 60 && studentPoint <= 69 ) {
            System.out.println(" You get grade D ");
        } else if (studentPoint <= 59) {
            System.out.println(" სამწუხაროდ თქვენ ვერ ჩააბარეთ საგანი. მომდევნო სემესტრში შევხვდებით 😊 ");
        } else {
            System.out.println(" 'გენიოსი' ხარ ");
        }
    }
}
