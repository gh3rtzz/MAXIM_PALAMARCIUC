package org.example.homewirk_nr_8;

public interface Animal {
    String name = null;
    int legs = 0;

    default void breath(){
        System.out.println("Animal is breathing");
    }
    static void type(){
        System.out.println("This is Animal");
    }
    void move();
    void eat();
}
