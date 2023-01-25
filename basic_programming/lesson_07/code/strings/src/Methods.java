public class Methods {
    // Не получает ничего.
    // Не возвращает ничего, просто выводит на экран слово Hello.
    public static void sayHello() {
        System.out.println("Hello!");
    }

    // Получает имя, с которым надо создать приветствие.
    // Вернёт строку с приветствием, обратившись по имени.
    public static String greetSomeone(String name) {
        return "Hello " + name + "!";
    }

    public static void main(String[] args) {
        sayHello();

        String greet = greetSomeone("Kirill");
        System.out.println(greet);

        System.out.println(greetSomeone("Eugene"));
    }
}
