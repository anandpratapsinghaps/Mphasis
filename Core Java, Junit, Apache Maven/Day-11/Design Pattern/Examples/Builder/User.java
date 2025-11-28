package com.example.builder;
class User {
    private String name;
    private int age;
    private String city;

    // Constructor accepts normal builder object
    public User(UserBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.city = builder.city;
    }

    public void show() {
        System.out.println(name + " | " + age + " | " + city);
    }
}
