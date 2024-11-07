import java.util.Scanner;

public class Lesson_1_1 {
    public static void main(String[] args) {
        // Начало программы
        System.out.println("Привет мир!");
        System.out.println(78); // Распечатка числа

        System.out.println(2 + 3 * 4 / 6 - 1);
        System.out.println(13 % 5); // Остаток после деления

        int ageOfMyFriend = 24; // Создание переменной и присваивание значения

        System.out.println(ageOfMyFriend);
        System.out.println(2024 - ageOfMyFriend);

        ageOfMyFriend = 30; // Перезапись значения
        System.out.println(ageOfMyFriend);

        double weightOfNoteBook = 4.4567;
        float price = 500.5f;

        boolean isSunny = false;
        char gender = 'M';

        String myName = "Jim Brown";
        System.out.println(weightOfNoteBook);
        System.out.println(weightOfNoteBook + ageOfMyFriend);
        String prefix = "Mr. ";
        System.out.println(prefix + myName);


        System.out.println("Результат = " + 15 + 3);
        System.out.println("Результат = " + (15 + 3));

        System.out.println("Возраст моего друга: " + ageOfMyFriend);
        System.out.println("Год рождения моего друга: " + (2024 - ageOfMyFriend));

        String city; // Создание переменной
        Scanner scanner = new Scanner(System.in);
        System.out.println("С какого вы города? ");
        city = scanner.nextLine();
        System.out.println("Город " + city + " мне очень нравится");

        final char MY_FAVORITE_SYMBOL = '$';
        // MY_FAVORITE_SYMBOL = '8';
    }
}
