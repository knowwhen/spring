package org.when.demo.jpa.employee;

import org.when.demo.jpa.model.NamedEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee extends NamedEntity {
    @Column(name = "role")
    private String role;

    public Employee() {
    }

    public Employee(String name, String role) {
        setName(name);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                "role='" + role + '\'' +
                '}';
    }
}
