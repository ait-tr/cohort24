# Задача 1

Создайте абстрактный класс "Дом". В качестве аргумента конструктора принимайте адрес.

Напишите для адреса сеттер и геттер.

Создайте классы "Частный дом" и "Многоквартирный дом" - наследники класса "Дом".

При создании многоквартирного дома дополнительно принимайте в конструкторе целое число - количество подъездов.

В методе `toString()` выводите в удобном виде всю известную информацию о доме.

В основном файле программы создайте список домов, в который поместите два частных дома и один многоквартирный.

Выведите информацию о домах в списке с использованием цикла `for-each`.

# Задача 2

Добавьте классу "Дом" виртуальный метод "снести".

Перезапишите этот метод в "Частном доме" и "Многоквартирном доме":
- для частного дома выводите на экран: **"`Вы снесли частный дом`"**;
- для многоквартирного дома выведите на экран: **"`Вы снесли многоквартирный дом. %d подъездов!`"**
   Вместо **`%d`** должно быть число подъездов.

# Задача 3* (не обязательно)

Попробуйте дописать квесту из классной работы перемещение по комнатам.

**Вариант № 1**: для перемещения по карте каждой комнате можно задать координаты и хранить комнаты в двумерном списке `List<List<Room>>` или двумерном массиве `Room[][]`.

**Вариант № 2**: для каждой комнаты можно записать ссылки на её соседей (`Room left`, `Room right`...) и использовать существующее поле `Room current` класса `Game`.
