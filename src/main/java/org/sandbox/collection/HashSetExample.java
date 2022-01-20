package org.sandbox.collection;

import org.sandbox.models.Employee;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
  public static void main(String[] args) {
    Set<String> cities = new HashSet<>();
    cities.add("Pune");
    cities.add("Pune");
    cities.add("Delhi");
    cities.add(null);
    cities.add(null);
    System.out.println(cities);

    Set<Employee> employees = new HashSet<>();
    Employee abc = new Employee(1, "ABC", 100);
    Employee abc1 = new Employee(1, "ABC", 100);

    employees.add(abc);
    employees.add(abc1);
    System.out.println(employees);

  }
}
