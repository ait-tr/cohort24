import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Greeting {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Как тебя зовут?");
        String name = br.readLine();
        System.out.println("А фамилия?");
        String lastName = br.readLine();
        // public static String format(String format, Object... args) - собирает строку по формату format
        // из аргументов args
        String greetings = String.format("Привет, %s %s!", name, lastName); // "Привет, " + name + " " + lastName + "!";
        System.out.println(greetings);
    }
}
