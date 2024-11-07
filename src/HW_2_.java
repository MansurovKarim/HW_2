import java.util.Random;
public class HW_2_ {
    public static String permission(int age, int temperature){
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30){
            return "Можно идти гулять";
        }else if (age < 20 && temperature >= 0 && temperature <= 28){
            return "Можно идти гулять";
        }else if (age > 45 && temperature >= -10 && temperature <= 25){
            return "Можно идти гулять";
        }else{
        }return "Оставайтесь дома";
    }

    public static int generateRandomAge(){
        Random random = new Random();
        return random.nextInt(100);
    }

    public static void main(String[] args) {
        int age1 = generateRandomAge();
        int age2 = generateRandomAge();
        int age3 = generateRandomAge();
        int age4 = generateRandomAge();
        int age5 = generateRandomAge();

        System.out.println("1.Возраст: " + age1 + " " + "Температура: 10 -> " + permission(age1, 10));
        System.out.println("2.Возраст: " + age2 + " " + "Температура: 20 -> " + permission(age2, 20));
        System.out.println("3.Возраст: " + age3 + " " + "Температура: -5 -> " + permission(age3, -5));
        System.out.println("4.Возраст: " + age4 + " " + "Температура: 15 -> " + permission(age4, 15));
        System.out.println("5.Возраст: " + age5 + " "  + "Температура: 30 -> " + permission(age5, 30));
    }
}

