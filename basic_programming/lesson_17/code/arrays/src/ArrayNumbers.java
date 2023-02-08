public class ArrayNumbers {

  public static void main(String[] args) {
    int[] numbers = new int[5]; // массив из 5 чисел (int) - при создании там нули
    // индексы идут от 0 до (размер - 1) включительно
    // для размера 5 индексы будут: 0, 1, 2, 3, 4
    // значения:                    0, 0, 0, 0, 0

    numbers[3] = 7; // в элемент массива numbers с индексом 3 записать число 7
    // для размера 5 индексы будут: 0, 1, 2, 3, 4
    // значения после этой команды: 0, 0, 0, 7, 0

//    System.out.println(numbers); // так массив выводить нельзя - мы увидим только идентификатор

//    System.out.println(numbers[0]);
//    System.out.println(numbers[1]);
//    System.out.println(numbers[2]);
//    System.out.println(numbers[3]);
//    System.out.println(numbers[4]);
    // чтобы вывести элементы массива, надо перебрать эти элементы по одному
    for (int i = 0; i < 5; ++i) { // i - индекс массива
      // перебираем индексы массива - от 0 включая до 5 (размера) не включая
      System.out.println(numbers[i]);
//      System.out.printf("numbers[%d] = %d%n", i, numbers[i]);
//      System.out.println("numbers[" + i + "] = " + numbers[i]);
    }

    System.out.println(numbers[5]); // такого индекса в массиве длины 5 нет
    // будет ошибка ArrayIndexOutOfBoundsException
  }
}
