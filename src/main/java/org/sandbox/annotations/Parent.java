package org.sandbox.annotations;

public class Parent {

  public void someMethod() {
    // some logic
  }

  /**
   * This is depcrecated . PLease use newMethod
   */

  @Deprecated
  public void oldMethod() {
    // some logic
  }

  public void  newMethod() {
    // some logic
  }

}
