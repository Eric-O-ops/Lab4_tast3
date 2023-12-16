package com.eric.lab4_tast3.tasks;

public class Task1 {

    public static void main(String[] args) {
        double x = 1.0;
        double y = 2 * Math.pow(x, 2) + 15;

        for (; x < 20; x += 0.5) {
            System.out.println("y = " + y);
        }
    }
}
