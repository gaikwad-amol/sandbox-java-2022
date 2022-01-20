package org.sandbox.collection;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class IterateArrayListExample {

  public static void main(String[] args) {
//    List<String> colours = new ArrayList<>();
    List<String> colours = new CopyOnWriteArrayList<>();
    colours.add("Red");
    colours.add("Yellow");
    colours.add("Green");
    colours.add("Pink");

    System.out.println("Iterating using the FOR-LOOP");
    for (int i = 0; i < colours.size(); i++) {
      System.out.println("the colour is " + colours.get(i));
    }

    System.out.println("Iterating using the FOR-EACH/ enhanced for loop");
    for (String colour: colours) {
      System.out.println("the colour is " + colour);
    }

    colours.forEach(System.out::println);

    System.out.println("Iterating using the Iterator");
    Iterator<String> iterator = colours.iterator();
    while (iterator.hasNext()) {
      String colour = iterator.next();
      System.out.println("the colour is " + colour);
       colours.add("Black"); //-> ConcurrentModificationException on arrayList
    }
    System.out.println("----------");
    System.out.println(colours);

  }
}
