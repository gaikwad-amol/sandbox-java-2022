package org.sandbox.readerwriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterExample {

  public static void main(String[] args) throws IOException {
    newmethod1();
    BufferedWriter bufferedWriter = new BufferedWriter(
      new FileWriter("src/main/resources/copied-data.txt", true)
    );
    bufferedWriter.write("This is entered text");
    bufferedWriter.newLine();
    bufferedWriter.write("This is the second line!");
    bufferedWriter.newLine();
    bufferedWriter.flush();
//    bufferedWriter.close();
  }

  private static void newmethod1() {
    int i = 0;
    newmethod2();
  }

  private static void newmethod2() {
    int j = 0;
  }
}
