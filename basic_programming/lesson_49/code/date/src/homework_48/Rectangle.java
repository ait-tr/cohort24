package homework_48;

public class Rectangle {

  private final int length; // длина // неизменяемое значение, хотите новое - создайте новый объект
  private final int width; // ширина // неизменяемое значение, хотите новое - создайте новый объект
//  private final int height; // обычно в программировании ширина и высота, но у нас геометрия,
  // где длина и ширина
  private final long area; // можно считать каждый раз при вызове метода, а можно - заранее;
  // нам точно выгоднее заранее, потому что все наши размеры - final и не будут меняться.

  public Rectangle(int a, int b) {
    // в моей программе ширина всегда меньше длины
    // это геометрия, а не дизайн, тогда прямоугольники можно вращать без последствий
    length = Math.max(a, b);
    width = Math.min(a, b);
//    if ((long) a * (long) b != a * b) { // если площадь - int и мы хотим проверить пределы
//      throw new RuntimeException("The area is too big for the sides: " + a + ", " + b);
//    }
    area = (long) a * (long) b;
  }

  public int getLength() {
    return length;
  }

  public int getWidth() {
    return width;
  }

  public long getArea() {
//    return length * width; // можно считать именно здесь, каждый раз заново
    return area;
  }

  @Override
  public String toString() {
    return "Rectangle {длина: " + length + ", ширина: " + width + "} (площадь: " + area + ")";
  }
}
