import phones.MobilePhone;
import phones.OldPhone;
import phones.Phone;
import phones.smartphones.Iphone;

public class PhonesMain {

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
