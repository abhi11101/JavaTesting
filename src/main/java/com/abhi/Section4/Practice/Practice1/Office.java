package com.abhi.Section4.Practice.Practice1;

public class Office {

    private String name;

    public Office(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Office{" +
                "name='" + name + '\'' +
                '}';
    }
}
