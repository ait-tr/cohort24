// import java.io.BufferedReader;
import java.io.IOException;
// import java.io.InputStreamReader;

public class Reader {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int code = br.read();
        int code = System.in.read(); // прочитать числовой код символа
        // int, а не char - там может быть символ за пределами таблицы символов
        // например, символ конца файла
        char character = (char) code; // получить символ из его кода
        System.out.println("Код символа '" + character + "': " + code);

        code = code + 1;
        character = (char) code;
        System.out.println("Код символа '" + character + "': " + code);

        character++; // character = character + 1
        code = character;
        System.out.println("Код символа '" + character + "': " + code);

        character++;
        System.out.println("Код символа '" + character + "': " + (int) character);
        code = character;

        code++;
        System.out.println("Код символа '" + (char) code + "': " + code);
    }
}
