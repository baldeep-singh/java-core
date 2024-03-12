package com.learning.core.day5;
import java.util.Random;

class Register<T> {
    private String registerId;

    public String generateRegisterId(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(characters.charAt(random.nextInt(characters.length())));
        }
        return sb.toString();
    }

    public void display(T user) {
        if (user instanceof Employee) {
            Employee emp = (Employee) user;
            System.out.println(generateRegisterId(7) + " " + emp.getName() + " " + emp.getPhone() + " " + emp.getEmployeeId() + " " + emp.getPassport());
        } else if (user instanceof Student) {
            Student stu = (Student) user;
            System.out.println(generateRegisterId(7) + " " + stu.getName() + " " + stu.getPhone() + " " + stu.getLicense() + " " + stu.getPassport());
        }
    }
}

class Employee {
    private String name;
    private long phone;
    private String passport;
    private int license;
    private String panCard;
    private int voterId;
    private int employeeId;

    public Employee(String name, long phone, int employeeId, String passport) {
        this.name = name;
        this.phone = phone;
        this.employeeId = employeeId;
        this.passport = passport;
    }

    public Employee(String name, long phone, int employeeId, int license, String panCard) {
        this.name = name;
        this.phone = phone;
        this.employeeId = employeeId;
        this.license = license;
        this.panCard = panCard;
    }

    public Employee(String name, long phone, int employeeId, int voterId, int license) {
        this.name = name;
        this.phone = phone;
        this.employeeId = employeeId;
        this.voterId = voterId;
        this.license = license;
    }

    public String getName() {
        return name;
    }

    public long getPhone() {
        return phone;
    }

    public String getPassport() {
        return passport;
    }

    public int getLicense() {
        return license;
    }

    public String getPanCard() {
        return panCard;
    }

    public int getVoterId() {
        return voterId;
    }

    public int getEmployeeId() {
        return employeeId;
    }
}

class Student {
    private String name;
    private long phone;
    private String passport;
    private int license;
    private String panCard;
    private int voterId;

    public Student(String name, long phone, String passport) {
        this.name = name;
        this.phone = phone;
        this.passport = passport;
    }

    public Student(String name, long phone, int license, String panCard) {
        this.name = name;
        this.phone = phone;
        this.license = license;
        this.panCard = panCard;
    }

    public Student(String name, long phone, int voterId, int license) {
        this.name = name;
        this.phone = phone;
        this.voterId = voterId;
        this.license = license;
    }

    public String getName() {
        return name;
    }

    public long getPhone() {
        return phone;
    }

    public String getPassport() {
        return passport;
    }

    public int getLicense() {
        return license;
    }

    public String getPanCard() {
        return panCard;
    }

    public int getVoterId() {
        return voterId;
    }
}

public class D05P01 {
    public static void main(String[] args) {
        Register<Employee> employeeRegister = new Register<>();
        Employee employee = new Employee("Arun", 9123456780L, 1101, "LA78833DG");
        employeeRegister.display(employee);

        Register<Student> studentRegister = new Register<>();
        Student student = new Student("Joseph", 9123412780L, 2210, "SJLD1717K");
        studentRegister.display(student);
    }
}
