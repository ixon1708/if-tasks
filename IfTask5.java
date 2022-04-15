import java.util.Scanner;

public class IfTask5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();
        if (money % 100 > 9 && money % 100 < 20) { //на русском это задание сложнее т.к. не 511 рубль, а 511 рублей и т.п.
            System.out.println(money + " рублей");
        } else if (money % 10 == 1) {
            System.out.println(money + " рубль");
        } else if (money % 10 > 1 && money % 10 < 5) {
            System.out.println(money + " рубля");
        } else {
            System.out.println(money + " рублей");
        }
    }
}
