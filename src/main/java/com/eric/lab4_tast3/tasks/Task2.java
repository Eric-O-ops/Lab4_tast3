package com.eric.lab4_tast3.tasks;

public class Task2 {

    public static void main(String[] args) {

        var x = 0;
        var y = (double)0;

        for (;x<=16;x+=2) {
            y = 0.8*x-Math.sin(Math.pow(x, 0.5))-0.1;
            System.out.println(y);
        }
    }
}
