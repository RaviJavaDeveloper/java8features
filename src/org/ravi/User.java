package org.ravi;

public class User {

    private String name;
    private String location;
    private int salary;

    public User(String name, String location, int salary) {
        this.name = name;
        this.location = location;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", salary=" + salary +
                '}';
    }
}
