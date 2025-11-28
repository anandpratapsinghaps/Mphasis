package com.example.builder;
public class Main {
    public static void main(String[] args) {

        UserBuilder builder = new UserBuilder();

        User user = builder
                        .setName("Vijay")
                        .setAge(25)
                        .setCity("Delhi")
                        .build();

        user.show();
    }
}
