package com.company.Extend;

public class Person {
    private String name;
    private String designation;


    public void learn() {

    }

    public void walk() {

    }

    public void eat() {


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;


    }

    @Override
    public String toString() {
        return
                "���: " + name + ", ������: " + designation;
    }
}
