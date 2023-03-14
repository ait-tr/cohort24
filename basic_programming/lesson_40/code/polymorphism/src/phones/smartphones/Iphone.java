package phones.smartphones;

import phones.MobilePhone;

public class Iphone extends MobilePhone {

  @Override
  public void call(String phoneNumber) {
    System.out.println("[[ А у меня iPhone! ]]");
    // super в данном случае - MobilePhone
    super.call(phoneNumber);
  }
}
