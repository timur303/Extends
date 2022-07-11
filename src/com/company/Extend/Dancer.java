package com.company.Extend;

public class Dancer extends Person {
    private String groupName;

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void eat() {
        System.out.println(" ечинде тамактанат");
    }


    public void learn() {
        System.out.println("ќкуулары бий жаатында");
    }

    public void walk() {
        System.out.println("Ёрте менен сейилдейт");
    }
}
