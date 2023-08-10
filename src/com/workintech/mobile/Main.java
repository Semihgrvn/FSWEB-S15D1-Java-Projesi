package com.workintech.mobile;

public class Main {
    public static void main(String[] args) {
        MobilePhone phone= new MobilePhone("123132");
        phone.addNewContact(new Contact("ali", "1313123"));
        phone.addNewContact(new Contact("ali", "1313123"));
        phone.addNewContact(new Contact("semo", "13271327"));
        phone.addNewContact(new Contact("memo", "212112"));
        phone.printContact();

        System.out.println("Query Contact: " + phone.queryContact("semo"));
    }
}
