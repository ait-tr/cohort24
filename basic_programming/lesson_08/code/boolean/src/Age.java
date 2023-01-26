import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Age {
    // константы -- переменные, которые не будут меняться
    // final public static типКонстанты ИМЯ_КОНСТАНТЫ = значение; // SNAKE_CASE
    final public static int BIKE_ALLOWED = 16;
    final public static int CAR_ALLOWED = 18;
    final public static int DRINK_ALLOWED = 21;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите возраст: ");
        int age = Integer.parseInt(br.readLine()); // возраст

        // можно ли получить права на мотоцикл
        boolean canRideBike = age >= BIKE_ALLOWED; // age >= 16
        // можно ли получить права на автомобиль
        boolean canRideCar = age >= CAR_ALLOWED; // age >= 18
        // можно ли пить крепкий алкоголь в США
        boolean canDrink = age >= DRINK_ALLOWED; // age >= 21

        System.out.println("Вам можно получать права на мотоцикл: " + canRideBike);
        System.out.println("Вам можно получать права на автомобиль: " + canRideCar);
        System.out.println("Вам можно пить крепкий алкоголь в США: " + canDrink);
        System.out.println("Вы прожили меньше половины века: " + (age < 50));
    }
}
