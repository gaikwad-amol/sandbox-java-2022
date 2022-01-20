package org.sandbox.readerwriter;

import org.sandbox.models.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectOutputStreamExample {

  public static void main(String[] args) throws IOException, ClassNotFoundException {

//    writeOperation();

    ObjectInputStream inputStream = new ObjectInputStream(
      new FileInputStream("src/main/resources/Employees.ser")
    );
    Employee employeeCopy = (Employee) inputStream.readObject();
    System.out.println(employeeCopy.getName());
  }

  private static void writeOperation() throws IOException {
    List<Employee> list = new ArrayList<>();
//    list.add(new Employee(1, "ABC", salary));
//    list.add(new Employee(2, "XYZ", salary));

    ObjectOutputStream outputStream = new ObjectOutputStream(
      new FileOutputStream("src/main/resources/Employees.ser"));
    for (Employee employee: list) {
      outputStream.writeObject(employee);
    }
    outputStream.flush();
    outputStream.close();
  }
}
