import java.util.Random;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Random Random = new Random();
        int RandomNumber = Random.nextInt(50)+1;
      //  System.out.println("Random number is " + RandomNumber);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number 1 to 50 ");
        int costumerAssume = scanner.nextInt();

     while (true) {
         if (costumerAssume == RandomNumber) {
             System.out.println("Congratulation, you get it!");
             break;
         } else if (costumerAssume < RandomNumber) {
             System.out.println("Please enter higher number");
             costumerAssume = scanner.nextInt();
         } else {
             System.out.println("Please enter lower number");
             costumerAssume = scanner.nextInt();
         }
     }

    }
}
