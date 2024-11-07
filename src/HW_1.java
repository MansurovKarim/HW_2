import java.util.Enumeration;
import java.util.Scanner;

public class HW_1 {
    public static void main(String[] args) {
        String myFavouriteColor;
        final int NUM = 18;
        String word = " Hello world! ";
        System.out.println(NUM + word);
        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        }else if (NUM > 0 ) {
            System.out.println("Вы сохранили положительное число");
        }else {
            System.out.println("Вы сохранили ноль");

        } String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        name = scanner.nextLine();
        System.out.println("Привет," + name + "!");
    }
}
