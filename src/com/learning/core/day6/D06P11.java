package com.learning.core.day6;
import java.util.Hashtable;
import java.util.Scanner;

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
        return id + " " + name + " " + designation + " " + department;
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

public class D06P11 {
    public static void main(String[] args) {
        Hashtable<Integer, Employee> employeeHashtable = new Hashtable<>();

        Employee emp1 = new Employee(1001, "John Doe", "Finance", "Manager");
        Employee emp2 = new Employee(1002, "Jane Smith", "Human Resources", "HR Specialist");
        Employee emp3 = new Employee(1003, "Robert", "Development", "Product Manager");
        Employee emp4 = new Employee(1004, "Alice Johnson", "IT", "Software Engineer");

        employeeHashtable.put(emp1.hashCode(), emp1);
        employeeHashtable.put(emp2.hashCode(), emp2);
        employeeHashtable.put(emp3.hashCode(), emp3);
        employeeHashtable.put(emp4.hashCode(), emp4);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the ID of the employee to search: ");
        int searchId = scanner.nextInt();
        
        Employee foundEmployee = employeeHashtable.get(searchId);
        
        if (foundEmployee != null) {
            System.out.println(foundEmployee);
        } else {
            System.out.println("Employee with ID " + searchId + " not found.");
        }
        
        scanner.close();
    }
}
