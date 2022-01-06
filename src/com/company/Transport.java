package com.company;

public class Transport {
    private String name;

    public String getName() {
        return name;
    }

    public Transport(String name) {
        this.name = name;
    }
    public String getInfo(){
        return "name: " + getName();

    }
}
