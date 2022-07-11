package com.company.Extend;

public class Singer extends Person {
    private String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }


    public void learn() {
        System.out.println("�������� ��������");
    }

    public void eat() {
        System.out.println("���� ����� ����������");
    }

    public void walk() {
        System.out.println("������� �� ���� ���������� ���������");
    }

    public void playGitar() {
        System.out.println("����� ������ ��������");
    }
}
