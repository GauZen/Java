package com.qa.model;

public abstract class Animal implements Comparable<Animal>{
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
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

    public abstract String sayHello();
    public abstract String move();


    public String toString() {
        return "Name='" + name +
                " Age=" + age;
    }

    public int compareTo(Animal o){
        return age - o.getAge();
    }
}
