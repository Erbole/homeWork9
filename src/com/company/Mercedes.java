package com.company;

public class Mercedes {
    private String model;
    private Color color;

    public String getModel() {
        return model;
    }

    public Color getColor() {
        return color;
    }

    public Mercedes(String model, Color color) {
        this.model = model;
        this.color = color;
    }
    public String getInfo(){
        return "model: " + getModel() +
                "\ncolor: " + getColor();
    }
}
