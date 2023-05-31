package com.example.aws_sample.model;

public class User {
    private int id;
    private String name;

    private String salary;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public User(int id, String name, String salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}
