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


    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.id, other.id);
    }


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


   
    public int hashCode() {
        return Objects.hash(id, name, age, salary);
    }
}

public class D05P08 {
    public static void main(String[] args) {

        Person person1 = new Person(1, "Alice", 30, 50000);
        Person person2 = new Person(2, "Bob", 40, 60000);
        Person person3 = new Person(3, "Charlie", 25, 45000);
        Person person4 = new Person(4, "David", 35, 55000);
        Person person5 = new Person(5, "Eve", 28, 52000);
        Person person6 = new Person(6, "Frank", 22, 40000);

       
        TreeSet<Person> peopleSet = new TreeSet<>();
        peopleSet.add(person1);
        peopleSet.add(person2);
        peopleSet.add(person3);
        peopleSet.add(person4);
        peopleSet.add(person5);
        peopleSet.add(person6);


        System.out.println("Names in Uppercase:");
        for (Person person : peopleSet) {
            System.out.println(person.getName().toUpperCase());
        }
    }
}
