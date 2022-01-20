package org.sandbox.exceptions;

import org.sandbox.models.Employee;

public class EmployeeValidation {

  public boolean isEmployeeValid(Employee employee) throws Exception {
    if (employee.getId() == 0) {
      throw new Exception("Invalid employee ID");
    }
    return true;
  }

  public boolean isEmployeeValid2(Employee employee) throws InvalidEmployeeInfoException {
    if (employee.getId() == 0) {
      throw new InvalidEmployeeInfoException("Invalid employee ID");
    }
    if (employee.getName() == null || employee.getName() == "") {
      throw new InvalidEmployeeInfoException("Invalid employee Name");
      // throw new Illeg("Invalid employee Name");
    }
    return true;
  }

  public static void main(String[] args) throws InvalidEmployeeInfoException {
    EmployeeValidation employeeValidation = new EmployeeValidation();
    try {
      employeeValidation.isEmployeeValid(new Employee(0, "ABC", 10000));
    } catch (Throwable e) {
      e.printStackTrace();
      throw new RuntimeException("Something went wrong! Please contact administrator");
    }

    employeeValidation.isEmployeeValid2(new Employee(1, null, 90000));
  }
}
