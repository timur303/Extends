package com.company.Extend;

public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Тимур", "Программист", "Пиксофт");
        Dancer dancer = new Dancer("Айжамал", "Бийчи", "Кыз-Бурак");
        Singer singer = new Singer("Асел", "Ырчы", "Биз тобу");


        System.out.println("Компаниянын аты:" + programmer.getCompanyName());
        System.out.println(programmer);
        programmer.learn();
        programmer.walk();
        programmer.eat();
        programmer.coding();
        System.out.println("_________________");

        System.out.println("Команданын аты: " + dancer.getGroupName());
        System.out.println(dancer);
        dancer.learn();
        dancer.walk();
        dancer.eat();
        System.out.println("______________________");

        System.out.println("Команданын аты :" + singer.getBandName());
        System.out.println(singer);
        singer.learn();
        singer.walk();
        singer.eat();
        singer.playGitar();

    }
}
