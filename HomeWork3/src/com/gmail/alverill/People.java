package com.gmail.alverill;

import java.io.Serializable;

public class People implements Serializable{
    private String name;
    private int age;
    private int answer;

    public People(String name, int age, int answer) {
        this.name = name;
        this.age = age;
        this.answer = answer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }
}
