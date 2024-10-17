import java.util.Random;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Random Random = new Random();
        int RandomNumber = Random.nextInt(50)+1;
        System.out.println("Random number is " + RandomNumber);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number 1 to 50 ");
        int costumerAssume = scanner.nextInt();
        if (costumerAssume == RandomNumber) {
            System.out.println("Congratulation, you get it!");
        } else {
            System.out.println("Unfortunately, you did not get it!");
        }
    }
}
