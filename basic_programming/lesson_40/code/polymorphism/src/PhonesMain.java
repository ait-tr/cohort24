import phones.MobilePhone;
import phones.OldPhone;
import phones.Phone;
import phones.smartphones.Iphone;

public class PhonesMain {

  // method overriding - перезапись метода
  // есть аннотация @Override
  //   в дочернем классе делаем такой же метод с другим кодом внутри.

  // method overloading - перегрузка метода
  // (никакого служебного слова или аннотации для этого нет)
  //   в том же или дочернем классе делаем метод с таким же названием
  //   и другим количеством аргументов - смысл может быть похожим,
  //   а код будет разным.
  //   Для Java это два разных метода
  // Пример: разные конструкторы
  // Ещё пример: количество не меняется, но меняется тип аргумента:
  // String.contains(String)
  // String.contains(char)

  // final - ключевое слово, запрещающее делать наследников
  // или перезаписывать метод
  // для переменной или члена (атрибута) класса - запрет изменений
  // НО: final атрибут можно записать (установить значение) в конструкторе

  // static - нельзя перезаписать, но можно "спрятать"
  //   если в дочернем классе создан "такой же" статический метод,
  //   то "базовый" статический метод не видно
  // "снаружи" статические методы вызываются через имя класса:
  //   Integer.parseInt()
  //   какой класс написали, тот метод и будет вызван
  // статические методы нельзя перезаписывать в не-статические и наоборот

  public static void main(String[] args) {
    Phone prostoTelephon = new Phone();
    prostoTelephon.call("+1234567");

    Phone staryjTelephon = new OldPhone();
    staryjTelephon.call("+2345678");
    staryjTelephon.call("2345678");

    Phone mobile = new MobilePhone();
    mobile.call("+3456789");

    Phone novyjTelephon = new Iphone();
    novyjTelephon.call("+4567890");
  }
}
