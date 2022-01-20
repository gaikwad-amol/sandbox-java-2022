package org.sandbox.readerwriter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderExample {

  public static void main(String[] args) {
    BufferedReader bufferedReader = null;
    try {
      System.out.println("inside the try block");
      bufferedReader = new BufferedReader(new FileReader("src/main/resources/test-data1.txt"));
      String line;
      while ((line = bufferedReader.readLine()) != null) {
        System.out.println(line);
      }
      System.out.println("leaving try block");
    } catch (FileNotFoundException e) {
      System.out.println(e.getMessage());
      System.out.println("the file is not present!!");
      e.printStackTrace();
    } catch (IOException e) {
      System.out.println("there is an IO exception!!");
      e.printStackTrace();
    } finally {
      System.out.println("in the final block");
      try {
        if (bufferedReader != null) {
          bufferedReader.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
