package ru.mirea.gibo04.lab1;
import java.lang.System;

public class Main{
    public static void main (String [] args){
        Dog d1=new Dog("Sunprunshuc",2);
        Dog d2=new Dog("Helen",5);
        Dog d3=new Dog("Bod", 12);

        System.out.println(d1);
        d1.setAge(21);
        System.out.println(d1);

    }
}
