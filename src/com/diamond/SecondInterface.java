package com.diamond;

public interface SecondInterface {
	default void display() {
        System.out.println("Default method from SecondInterface");
    }

}