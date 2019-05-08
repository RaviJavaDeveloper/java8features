package org.ravi;

class User {

    private String name;
    private String location;
    private int salary;

     User(String name, String location, int salary) {
        this.name = name;
        this.location = location;
        this.salary = salary;
    }

     String getName() {
        return name;
    }

     int getSalary() {
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
