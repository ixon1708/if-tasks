import java.util.Scanner;

public class IfTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a <= b && a <= c) {
            System.out.println("Минимальное число из чисел " + a + " " + b + " и " + c + " - это " + a);
        } else if (b <= a && b <= c) {
            System.out.println("Минимальное число из чисел " + a + " " + b + " и " + c + " - это " + b);
        } else {
            System.out.println("Минимальное число из чисел " + a + " " + b + " и " + c + " - это " + c);
        }
    }
}
