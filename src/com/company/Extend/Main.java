package com.company.Extend;

public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("�����", "�����������", "�������");
        Dancer dancer = new Dancer("�������", "�����", "���-�����");
        Singer singer = new Singer("����", "����", "��� ����");


        System.out.println("����������� ���:" + programmer.getCompanyName());
        System.out.println(programmer);
        programmer.learn();
        programmer.walk();
        programmer.eat();
        programmer.coding();
        System.out.println("_________________");

        System.out.println("���������� ���: " + dancer.getGroupName());
        System.out.println(dancer);
        dancer.learn();
        dancer.walk();
        dancer.eat();
        System.out.println("______________________");

        System.out.println("���������� ��� :" + singer.getBandName());
        System.out.println(singer);
        singer.learn();
        singer.walk();
        singer.eat();
        singer.playGitar();

    }
}
