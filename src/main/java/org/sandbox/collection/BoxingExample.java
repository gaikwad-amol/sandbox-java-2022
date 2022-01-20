package org.sandbox.collection;

import java.util.ArrayList;
import java.util.List;

public class BoxingExample {

  public static void main(String[] args) {
    int i = 32;
    Integer integer = new Integer(32);

    List<Integer> list = new ArrayList<>();
    list.add(new Integer(32));
    //No compilation error - autoboxing
    list.add(i);

    // no compilation error - unboxing
    int k = list.get(0);
  }


}
