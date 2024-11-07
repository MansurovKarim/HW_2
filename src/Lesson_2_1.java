public class Lesson_2_1 {
    public static void main(String[] args) {
        // Hi Sensei
        int number = 5;
        switch (number) {
            case 1:
                System.out.println("Number is equal to one");
                break;
            case 2:
                System.out.println("Number is equal to two");
                break;
            case 3:
                System.out.println("Number is equal to three");
                break;
            default:
                System.out.println("Number is unknown");
                break;
        }

        int temperature = 20, numberOfStudents = 13;
        boolean isRainy = true;

        if (numberOfStudents == 22 && temperature > 15) { // && - логический оператор И (AND)
            System.out.println("Play Football");
        }

        if (isRainy && temperature <= 20) { // && - логический оператор И (AND)
            System.out.println("Not a good weather");
        }

        if (isRainy || numberOfStudents < 15) { // || - логический оператор ИЛИ (OR)
            System.out.println("No picnic");
        }

        if (temperature > 10 && temperature < 25 || numberOfStudents > 15
                && numberOfStudents < 30 || isRainy) {
            // true && true || false && true || true => 1 * 1 + 0 * 1 + 1 => 1 + 0 + 1 = 1 (true)
            System.out.println("Go to work");
        }

        if (temperature > 10 && (temperature < 25 || numberOfStudents > 15)
                && numberOfStudents < 30 || isRainy) {
            // true && (true || false) && true || true => 1 * (1 + 0) * 1 + 1 => 1 * 1 * 1 + 1 = 1 (true)
            System.out.println("Go to school");
        }

        /*if(isRainy){
            System.out.println("Take an umbrella");
        }*/

        if (!isRainy) { // ! - логический оператор отрицания НЕ (NOT)
            System.out.println("Go swimming");
        }
    }
}
