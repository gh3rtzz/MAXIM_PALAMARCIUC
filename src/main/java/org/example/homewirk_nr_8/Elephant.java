package org.example.homewirk_nr_8;

public class Elephant extends Herbivor implements Animal {
    String name = "Elephant1";
    int legs = 4;
    int ears = 2;

    @Override
    public void breath() {
        Animal.super.breath();
    }

    @Override
    public void move() {
        System.out.println("Elephant is moving");
    }

    @Override
    public void eat() {
        System.out.println("Elephant is eating");
    }

    @Override
    void swallow() {
        System.out.println("Elephant is swallowing");
    }
}