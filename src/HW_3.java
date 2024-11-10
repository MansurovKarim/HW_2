import java.util.Arrays;

public class HW_3 {
    public static void main(String[] args){
        double[] numbers = {8.0, 2.0, -4.0, -2.5, 3.5, 6.0, -7.0, 1.2, -5.3, 2.1, -3.4, 4.5, -1.1, 6.6, -2.7};

        boolean foundFirstNegative = false;
        double sum = 0;
        int count = 0;

        for (double number : numbers) {
            if (foundFirstNegative) {
                if (number > 0) {
                    sum += number;
                    count++;
                }
            }
            if (!foundFirstNegative && number < 0) {
                foundFirstNegative = true;
            }
        }

        System.out.print("(");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print(") = ");

        System.out.println((int)sum + "/" + count);
    }
}
