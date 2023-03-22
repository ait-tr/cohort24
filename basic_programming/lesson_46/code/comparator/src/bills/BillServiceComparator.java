package bills;

import java.util.Comparator;

public class BillServiceComparator implements Comparator<Bill> {

  @Override
  public int compare(Bill o1, Bill o2) {
//    if (!o1.getService().equals(o2.getService())) {
//      return o1.getService().compareTo(o2.getService());
//    }
    String service1 = o1.getService();
    String service2 = o2.getService();
    if (!service1.equals(service2)) {
      return service1.compareTo(service2);
    }
    return (int) Math.signum(o1.getCost() - o2.getCost());
  }
}
