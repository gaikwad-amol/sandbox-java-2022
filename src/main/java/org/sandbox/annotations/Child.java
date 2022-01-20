package org.sandbox.annotations;

import java.util.ArrayList;
import java.util.List;

public class Child extends Parent {

  @Override
  public void someMethod() {
    // override the logic
  }

//  @SuppressWarnings("all")
  public static void main(String[] args) {
    Parent parent = new Parent();
    parent.oldMethod();
    List names = new ArrayList();
  }
}
