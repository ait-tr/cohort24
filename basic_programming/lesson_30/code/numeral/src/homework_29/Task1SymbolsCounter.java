package homework_29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Task1SymbolsCounter {

  // Написать программу, которая:
  // - читает с клавиатуры одну строку
  // - считает количество разных символов (с учётом повторений) в этой строке
  // - выводит частоту букв (порядок букв при выводе не важен)
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String line = br.readLine().toUpperCase();
    Map<Character, Integer> symbolsCounter = new HashMap<>(); // словарь счётчиков символов
    for (int i = 0; i < line.length(); ++i) { // перебираем символы в строке по порядку
      char c = line.charAt(i);
      if (!symbolsCounter.containsKey(c)) { // такого символа до этого не было
        symbolsCounter.put(c, 0); // делаем "базовый" (default) счётчик со значением 0
      }
      symbolsCounter.put(c, symbolsCounter.get(c) + 1); // записываем новое значение - (старое + 1)
    }

    // String : List<String>
    // char : Set<Character>
//    for (Map.Entry<Character, Integer> entry : symbolsCounter.entrySet()) {
//      System.out.println(entry.getKey() + ": " + entry.getValue());
//    }
    for (char c : symbolsCounter.keySet()) { // перебираем "посчитанные" символы
      System.out.println(c + ": " + symbolsCounter.get(c));
    }
  }
}
