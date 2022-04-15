import java.util.Scanner;

public class IfTask6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        //чисто для примера покажу как написать код, где не нужно повторять команду System.out.println();
        String dayName = "Такого дня не существует";
        if (day == 1) {
            dayName = "Понедельник";
        } else if (day == 2) {
            dayName = "Вторник";
        } else if (day == 3) {
            dayName = "Среда";
        } else if (day == 4) {
            dayName = "Четверг";
        } else if (day == 5) {
            dayName = "Пятница";
        } else if (day == 6) {
            dayName = "Суббота";
        } else if (day == 7) {
            dayName = "Воскресенье";
        }
        System.out.println(dayName);
    }
}
