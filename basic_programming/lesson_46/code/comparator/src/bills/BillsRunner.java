package bills;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BillsRunner {

  // наша программа должна:
  // описывать класс Bill (Счёт) с указанием названия услуги и суммы оплаты
  // уметь сортировать счета по названиям услуг, а потом по сумме
  // уметь сортировать счета по сумме, а потом по названиям услуг

  // "а потом" - это если на предыдущем уровне сравнения всё одинаковое
  // по названиям услуг, а потом по сумме:
  // - по названиям,
  // - если названия совпали, то по сумме.

  // - Прочитать список счетов с клавиатуры:
  //   Сначала количество, а потом для каждого счёта услугу и сумму;
  // - Вывести список, отсортированный разными способами.
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Введите количество счетов: ");
    int n = Integer.parseInt(br.readLine());
    List<Bill> bills = new ArrayList<>();
    for (int k = 1; k <= n; ++k) {
      System.out.println("Введите данные счёта № " + k);
      Bill bill = Bill.readBill();
      bills.add(bill);
    }

    for (Bill b : bills) {
      System.out.println(b);
    }
  }
}
