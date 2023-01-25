public class Strings {
    public static void main(String[] args) {
        String line = "Lorem ipsum dolor sit amet";
        System.out.println(line);
        // Строка (String) состоит из символов (char)
        // Все символы строки проиндексированы (пронумерованы)
        // Индексы начинаются с нуля
        // L - 0
        // o - 1
        // r - 2
        // e - 3
        // m - 4
        //   - 5
        // i - 6
        // p - 7
        // s - 8
        // u - 9
        // m - 10
        //   - 11
        // d - 12

        // public char charAt(int index) - получить символ строки с индексом index
        char seventh = line.charAt(7); // в скобочках -- индекс символа, который надо получить
        System.out.println("Символ с индексом 7 - " + seventh);
//        System.out.println("Символ с индексом 100 - " + line.charAt(100)); // Ошибка StringIndexOutOfBoundsException
//        // индекс вышел за границу строк

        // public int length() - получить длину строки
        int myLineLength = line.length();
        System.out.println("Длина строки - " + myLineLength + " символов");
        // Строка, прочитанная через readLine(), НЕ БУДЕТ иметь в конце символа '\n' - символа перевода строки

        // public String substring(int beginIndex) - вернёт подстроку с индекса beginIndex и до конца
        String subLine = line.substring(6); // "ipsum dolor sit amet"
        System.out.println("Подстрока от символа с индексом 6 до конца: \"" + subLine + "\"");
        // Экранирование символов: https://javarush.com/groups/posts/1921-ehkranirovanie-simvolov

        // public String substring(int beginIndex, int endIndex) - вернёт подстроку с индекса beginIndex и до endIndex
        // левая граница, как и раньше, включая, а вот правая - не включая
        // line.substring(5, line.length()) -- то же самое, что и просто line.substring(5)
        // line.substring(5, 9) выведет (9 - 5 = 4) символа с индексами 5, 6, 7, 8
        System.out.println("Подстрока с индексами от 6 до 11: \"" + line.substring(6, 11) + "\"");
    }
}
