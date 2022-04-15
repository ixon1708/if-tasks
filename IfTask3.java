import java.util.Scanner;

public class IfTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "-ый год високосный!");
        } else {
            System.out.println(year + "-ый год обычный!");
        }
    }
}
