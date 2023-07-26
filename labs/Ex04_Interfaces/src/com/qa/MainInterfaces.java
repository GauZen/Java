package com.qa;

public class MainInterfaces {
    public static void main(String[] args) {
        Circle c1 = new Circle("circle1", "red", 0,0,10);
        Circle c2 = new Circle("circle2", "blue", 10,10,5);
        System.out.println(c1);
        System.out.println(c2);

        System.out.println("Circle location befor move :" + c1.getCurrentLocation());
        c1.move(10.5,4.3);
        System.out.println("Circle location after move: " + c1.getCurrentLocation());
    }
}
