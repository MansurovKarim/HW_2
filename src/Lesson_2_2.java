public class Lesson_2_2 {

    public static void duration() {
        // невозвращаемый метод без параметров
        int minutes = 15;
        System.out.println("Длительность: " + minutes + " минут");
    }

    public static void makeTea() {
        // невозвращаемый метод без параметров
        System.out.println("Вскипятить воду");
        System.out.println("Насыпать заварку");
        System.out.println("Залить кипятком");
        System.out.println("Дать настояться");
        System.out.println("Налить в чашку");
        System.out.println("Добавить молоко или сахар по-вкусу");
        duration();
    }

    public static void main(String[] args) {
        System.out.println("ЗАВТРАК");
        makeTea();

        System.out.println("ОБЕД");
        makeTea();

        System.out.println("УЖИН");
        makeTea();

        addition(2, 6, "Сумма чисел");
        addition(20, 5, "Результат сложения");
        calculatePerimeter("Аудитория 4", 6.5, 4.5);
        calculatePerimeter("Холл", 10, 6);
        calculatePerimeter("Кухня", 3, 4.5);

        long areaOfAuditory4 = calculateArea(6.5, 4.5);
        System.out.println("Площадь комнаты Аудитория 4: " + areaOfAuditory4
                + " " + unit() + " в квадрате");

        long areaOfHall = calculateArea(10, 6);
        System.out.println("Площадь комнаты Холл: " + areaOfHall
                + " " + unit() + " в квадрате");

        long areaOfKitchen = calculateArea(3, 4.5);
        System.out.println("Площадь комнаты Кухня: " + areaOfKitchen
                + " " + unit() + " в квадрате");
        System.out.println("ОБЩАЯ ПЛОЩАДЬ: " + (areaOfAuditory4 + areaOfHall + areaOfKitchen)
                + " " + unit() + " в квадрате");

        // End of program
    }

    public static long calculateArea(double length, double width) {
        // возвращаемый метод с параметрами
        long area = Math.round(length * width);
        return area;
    }

    public static String unit() {
        // возвращаемый метод без параметров
        return "сантиметров";
    }

    public static void calculatePerimeter(String roomName, double length, double width) {
        // невозвращаемый метод с параметрами
        double perimeter = 2 * (length + width);
        System.out.println("Периметр комнаты " + roomName + ": " + perimeter + " " + unit());
    }

    public static void addition(int num1, int num2, String phrase) {
        // невозвращаемый метод с параметрами
        int result = num1 + num2;
        System.out.println(phrase + ": " + result);
    }

}
