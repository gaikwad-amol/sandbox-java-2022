package org.sandbox.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAndArraylistExample {

  public static void main(String[] args) {
    String[] fruits = new String[4];
    fruits[0] = "Apple";
    fruits[1] = "Orange";
    fruits[2] = "Banana";

    Arrays.stream(fruits)
      .forEach(System.out::println);
    System.out.println("Length of the array" + fruits.length);

    List<String> fruitList = new ArrayList<>();
    fruitList.add("Apple");
    fruitList.add("Orange");
    fruitList.add("Banana");

    fruitList.add("Apple");
    fruitList.add("Orange");
    fruitList.add("Banana");
    fruitList.add(null);

    System.out.println(fruitList);

    System.out.println(fruitList.contains("Orange"));
    System.out.println(fruitList.contains("Strawberry"));

    System.out.println(fruitList.get(1));
    System.out.println(fruitList.get(2));
//    System.out.println(fruitList.get(99));

    System.out.println("Length of the arrayList " + fruitList.size());
  }
}
