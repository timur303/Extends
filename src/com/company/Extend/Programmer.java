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
        System.out.println("�������� ����� ����� ");
    }

    public void walk() {
        System.out.println("���� ����� ��������");
    }

    public void eat() {
        System.out.println("���� 12:00 �� ��������");
    }

    public void coding() {
        System.out.println("Java ���� ������ ��� �����");
    }
}
