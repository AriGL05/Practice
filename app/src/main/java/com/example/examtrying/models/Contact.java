package com.example.examtrying.models;

public class Contact {
    String Name;
    String Number;

    public Contact(String name, String number) {
        Name = name;
        Number = number;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }
}
