package com.learning.core.day6;
import java.util.Hashtable;

class Employee {
    private int id;
    private String name;
    private String department;
    private String designation;

    public Employee(int id, String name, String department, String designation) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee ID: " + id + ", Name: " + name + ", Department: " + department + ", Designation: " + designation;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Employee employee = (Employee) obj;
        return id == employee.id;
    }
}

public class D06P10 {
    public static void main(String[] args) {
        Hashtable<Integer, Employee> employeeHashtable = new Hashtable<>();

        Employee emp1 = new Employee(101, "John Doe", "Finance", "Manager");
        Employee emp2 = new Employee(102, "Jane Smith", "Human Resources", "HR Specialist");
        Employee emp3 = new Employee(103, "Alice Johnson", "IT", "Software Engineer");
        Employee emp4 = new Employee(104, "Bob Williams", "Marketing", "Marketing Coordinator");

        employeeHashtable.put(emp1.hashCode(), emp1);
        employeeHashtable.put(emp2.hashCode(), emp2);
        employeeHashtable.put(emp3.hashCode(), emp3);
        employeeHashtable.put(emp4.hashCode(), emp4);

        System.out.println("Is the hashtable empty? " + employeeHashtable.isEmpty());
    }
}
