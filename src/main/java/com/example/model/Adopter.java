package com.example.model;

public class Adopter {
    private int id;         // Поле id
    private String name;    // Имя усыновителя
    private String phone;   // Телефон

    // Конструктор по умолчанию
    public Adopter() {}

    // Конструктор с параметрами
    public Adopter(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    // Геттер и сеттер для id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Геттеры и сеттеры для других полей
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}