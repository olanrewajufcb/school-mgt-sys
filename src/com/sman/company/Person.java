package com.sman.company;

    abstract class Person {
    private String name;
    private int age;

    public Person() {
        this("Wale"); //An example of overloaded constructor using this keyword to call the parameterised constructor
    }

    public Person(String name){

        this("Rasheed", 32); //constructor overloading
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void teach();

    public String getName(){return name;}
    }
