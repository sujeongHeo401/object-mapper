package com.example.objectmapper;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    private String name;
    private int age;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @JsonProperty("phone_number")
    private String phoneNumber;
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public User defaultUser(){
        return new User("default", 0, "010-1111-2222");
    }

    public User(){
        this.phoneNumber = null;
        this.name = null;
        this.age = 0;
    }

    public User(String name, int age, String phoneNumber){
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
