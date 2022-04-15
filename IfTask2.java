import java.util.Scanner;

public class IfTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 10 == 7) {
            System.out.println("Число " + number + " заканчивается на 7!");
        } else {
            System.out.println("Число " + number + " заканчивается не на 7!");
        }
    }
}
