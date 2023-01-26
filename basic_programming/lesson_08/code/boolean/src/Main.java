public class Main {
    // Тип boolean --- логический тип
    // автор идеи - George Boole - Джордж Буль - булевы переменные (или булевы значения)
    // булевы -- boolean

    // Возможные значения -- true (истина) и false (ложь)
    // boolean - примитивный тип, а не класс; на него не бывает ссылок
    // Форматированный вывод - %b

    public static void main(String[] args) {
        boolean flag = true;
        boolean anotherFlag = false;
        System.out.printf("flag = %b%n", flag);
        System.out.printf("anotherFlag = %b%n", anotherFlag);
        System.out.printf("никакой не флаг = %b%n", true);

        // В переменную типа boolean можно сохранять результат проверки условий
        boolean threeIsMoreThanFive = 3 > 5; // false
        System.out.println("3 > 5 = " + threeIsMoreThanFive);
        boolean pjatMenjsheSemi = 5 < 7; // true
        System.out.println("5 < 7 = " + pjatMenjsheSemi);
    }
}
