package org.example;

public class Student {
    String name;
    double grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    Student(String name, double grade)
    {
        this.name = name;
        this.grade = grade;
    }
}
