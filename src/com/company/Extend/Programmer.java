package com.company.Extend;

public class Programmer extends Person {
    private String companyName;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;


    }

    public String getCompanyName() {
        return companyName;
    }


    public void learn() {
        System.out.println("∆умуштан кийин окуйт ");
    }

    public void walk() {
        System.out.println("Ёрте менен сеилдейт");
    }

    public void eat() {
        System.out.println("—аат 12:00 до туштонот");
    }

    public void coding() {
        System.out.println("Java тили боюнча код жазат");
    }
}
