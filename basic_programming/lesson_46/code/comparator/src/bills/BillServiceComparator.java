package bills;

import java.util.Comparator;

public class BillServiceComparator implements Comparator<Bill> {

  private final boolean ignoreCase;

  public BillServiceComparator(boolean ignoreCase) {
    this.ignoreCase = ignoreCase;
  }

  @Override
  public int compare(Bill o1, Bill o2) {
//    if (!o1.getService().equals(o2.getService())) {
//      return o1.getService().compareTo(o2.getService());
//    }
    String service1 = o1.getService();
    String service2 = o2.getService();
    if (ignoreCase) {
      service1 = service1.toLowerCase();
      service2 = service2.toLowerCase();
    }
    if (!service1.equals(service2)) {
      return service1.compareTo(service2);
    }
    // getCost() - дробное число.
    // Разница дробных чисел - дробное и, возможно, маленькое (до 1 цента - 0.01);
    // если я эту разницу просто превращу в int, она может округлиться до нуля,
    // а минус или плюс превращать в ноль никак нельзя - числа разные, а не одинаковые.
    // Math.signum() - возвращает +1.0, 0.0 или -1.0 в зависимости от знака числа
    // signum - лат. "знак" (а sign - англ. "знак")
    // и его результат уже можно безопасно превращать в int
//    return (int) Math.signum(o1.getCost() - o2.getCost());
    Double cost1 = o1.getCost();
    Double cost2 = o2.getCost();
    return cost1.compareTo(cost2);
  }
}
