package org.example;

public class Main {
    public static void main(String[] args) {
        MyStringBuilder myStringBuilder = new MyStringBuilder("Hello ");
        myStringBuilder.append("world");
        myStringBuilder.append("!");
        System.out.println(myStringBuilder);
        myStringBuilder.undo();
        System.out.println(myStringBuilder);
    }
}