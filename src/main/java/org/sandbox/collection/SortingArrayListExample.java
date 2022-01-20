package org.sandbox.collection;

import org.sandbox.models.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingArrayListExample {

  public static void main(String[] args) {
    List<String> cities = new ArrayList<>();
    cities.add("Pune");
    cities.add("Bangalore");
    cities.add("Delhi");

    List<Integer> numbers = new ArrayList<>();
    numbers.add(100);
    numbers.add(99);
    numbers.add(200);

//    Comparator<String> citiesComparator = Comparator.comparing()
    Collections.sort(cities);
    System.out.println(cities);

    Collections.sort(numbers);
    System.out.println(numbers);

    List<Employee> employees = new ArrayList<>();
    employees.add(new Employee(2, "XYZ", 300));
    employees.add(new Employee(1, "ABC", 100));
    employees.add(new Employee(20, "XYZ23432", 300));
    employees.add(new Employee(99, "XYZ1111", 300));
    employees.add(new Employee(3, "PQR", 200));

    employees.sort(Comparator.comparing(Employee::getId));
    System.out.println(employees);

    employees.sort(
      Comparator.comparing(Employee::getName).reversed()
    );
    employees.sort(
      Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary)
    );
    System.out.println(employees);


  }
}
