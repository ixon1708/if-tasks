import java.util.Scanner;

public class IfTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x % 2 == 0) {
            System.out.println("Число " + x + " чётное!");
        } else {
            System.out.println("Число " + x + " НЕ чётное!");
        }
    }
}
