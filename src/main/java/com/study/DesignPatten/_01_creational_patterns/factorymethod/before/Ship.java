package com.study.DesignPatten._01_creational_patterns.factorymethod.before;

public class Ship {
    private String name;
    private String logo;
    private String color;

    public Ship() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", logo='" + logo + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
