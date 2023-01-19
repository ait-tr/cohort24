Для вывода данных на экран мы использовали System.out. Для ввода данных будем использовать  System.in.

У System.in есть минус – он позволяет считать с клавиатуры только коды символов. Чтобы обойти эту проблему и считывать большие порции данных за один раз, мы будем использовать более сложную конструкцию:

```java
Reader inputStreamReader = new InputStreamReader(System.in);
BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

String name = bufferedReader.readLine(); //читаем строку с клавиатуры
String sAge = bufferedReader.readLine(); //читаем строку с клавиатуры
int nAge = Integer.parseInt(sAge); //преобразовываем строку в число.
```

Более компактная запись:

```java
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

String name = br.readLine();
String sAge = br.readLine();
int nAge = Integer.parseInt(sAge);
```

Именно её мы и будем использовать в дальнейшем.

Подробности про класс `BufferedReader`: https://javarush.com/groups/posts/1919-schitihvanie-s-klaviaturih--riderih

**Бонус**: подробности про класс `Scanner`: https://javarush.com/groups/posts/klass-scanner
