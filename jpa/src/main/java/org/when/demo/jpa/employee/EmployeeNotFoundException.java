package org.when.demo.jpa.employee;

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(Integer id) {
        super("Could not find employee " + id);
    }
}
