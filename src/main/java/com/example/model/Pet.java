package com.example.model;

public class Pet {
    private int id;
    private String name;
    private String type;

    // Конструктор без параметров
    public Pet() {}

    // Конструктор с параметрами
    public Pet(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    // Геттеры и сеттеры
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}