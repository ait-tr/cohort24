package bills;

import java.util.Comparator;

public class BillCostComparator implements Comparator<Bill> {

  @Override
  public int compare(Bill o1, Bill o2) {
//    double cost1 = o1.getCost();
//    double cost2 = o2.getCost();
//    if (o1 != o2) {
//      return (int) Math.signum(cost1 - cost2)
//    }
    Double cost1 = o1.getCost();
    Double cost2 = o2.getCost();
    if (!cost1.equals(cost2)) {
      return cost1.compareTo(cost2);
    }
    return o1.getService().compareTo(o2.getService());
  }
}
