package org.sandbox.models;

import java.io.Serializable;
import java.util.Objects;

public class Employee implements Serializable, Comparable {
  public static final long serialVersionUID = 32423432;

  private int id;
  private String name;
  private int salary;

  public Employee(int id, String name, int salary) {
    if (id == 0) {
      throw new RuntimeException("");
    }
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getSalary() {
    return salary;
  }

  @Override
  public String toString() {
    return "Employee{" +
      "id=" + id +
      ", name='" + name + '\'' +
      ", salary=" + salary +
      '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Employee employee = (Employee) o;
    return id == employee.id && salary == employee.salary && Objects.equals(name, employee.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, salary);
  }

  @Override
  public int compareTo(Object o) {
    return Integer.compare(id, ((Employee) o).getId());
  }
}
