package com.learning.core.day5;
import java.util.*;

class Person implements Comparable<Person> {
    private int id;
    private String name;
    private int age;
    private double salary;

    // Constructor
    public Person(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    // Natural sorting by ID
    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.id, other.id);
    }

    // equals method override
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return id == person.id &&
                age == person.age &&
                Double.compare(person.salary, salary) == 0 &&
                Objects.equals(name, person.name);
    }

    // hashCode method override
    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, salary);
    }
}

public class D05P10 {
    public static void main(String[] args) {
        // Predefined info of 6 people
        Person person1 = new Person(1, "Alice", 30, 50000);
        Person person2 = new Person(2, "Job", 40, 60000);
        Person person3 = new Person(3, "Charlie", 25, 45000);
        Person person4 = new Person(4, "David", 35, 55000);
        Person person5 = new Person(5, "Eve", 28, 52000);
        Person person6 = new Person(6, "Frank", 22, 40000);

        // Storing in TreeSet for natural ordering (based on ID)
        TreeSet<Person> peopleSet = new TreeSet<>();
        peopleSet.add(person1);
        peopleSet.add(person2);
        peopleSet.add(person3);
        peopleSet.add(person4);
        peopleSet.add(person5);
        peopleSet.add(person6);

        // Finding the first person whose name starts with "J"
        for (Person person : peopleSet) {
            if (person.getName().startsWith("J")) {
                System.out.println("First person whose name starts with 'J':");
                System.out.println("ID: " + person.getId() + ", Name: " + person.getName() +
                        ", Age: " + person.getAge() + ", Salary: " + person.getSalary());
                break;
            }
        }
    }
}
