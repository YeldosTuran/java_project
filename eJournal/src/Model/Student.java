package Model;

import java.util.ArrayList;

public class Student implements  Person{
    private String name, surname;
    private double gpa;
    private ArrayList<Subject> subjects;
    public Student(String name, String surname, int year, double gpa){
        this.name = name;
        this.gpa = gpa;
        this.surname = surname;
        this.subjects = new ArrayList<Subject>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public void setSurname(String surname) {
        this.surname = surname;
    }

}
