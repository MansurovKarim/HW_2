public class Lesson_1_2 {
    public static void main(String[] args) {
        int temperature = 4;
        int numberOfStudents = 10;
        boolean isRainy = false;
        boolean tempIsLessThanStudents = temperature < numberOfStudents;

        System.out.println(tempIsLessThanStudents);

        if (temperature > 0) { // true
            String parkTitle = "Alatoo";
            System.out.println("Go to the park " + parkTitle + "!");
        }

        if (numberOfStudents == 22) { // false
            System.out.println("Play Football");
        }

        if (isRainy) { // false
            System.out.println("Take an umbrella");
        } else {
            System.out.println("Take on a hat");
        }

        if (temperature < 10) { // true
            System.out.println("You can not swim");
        } else {
            System.out.println("You can swim");
        }

        temperature = 17;
        if (temperature > 30) {
            System.out.println("The weather is hot");
        } else if (temperature > 20) {
            System.out.println("The weather is warm");
        } else if (temperature > 10) {
            System.out.println("The weather is cool");
        } else if (temperature > 0) {
            System.out.println("The weather is cold");
        } else {
            System.out.println("The weather is freezing");
        }

        if (numberOfStudents > 15) { // false
            System.out.println("Go to the picnic");
            if (temperature > 20) {
                System.out.println("Eat an ice-cream");
            } else {
                System.out.println("Drink a hot tea");
            }
        }
        numberOfStudents = numberOfStudents + 10; // 20
        if (numberOfStudents > 15) { // true
            System.out.println("Go to the cafe");
            if (temperature > 20) {
                System.out.println("Drink an ice late");
            } else {
                System.out.println("Eat a plov");
            }
        }
    }
}
