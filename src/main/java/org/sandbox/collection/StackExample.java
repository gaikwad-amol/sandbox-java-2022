package org.sandbox.collection;

import java.util.Stack;

public class StackExample {

  public static void main(String[] args) {

    Stack<String> pringles = new Stack<>();

    pringles.add("chip 1");
    pringles.add("chip 2");
    pringles.add("chip 3");
    pringles.push("chip 4");
    pringles.push("chip 5");

    System.out.println(pringles);
    System.out.println("peek -" + pringles.peek());
    System.out.println(pringles);
    System.out.println("pop -" + pringles.pop());
    System.out.println("pop -" + pringles.pop());
    System.out.println(pringles);
  }
}
