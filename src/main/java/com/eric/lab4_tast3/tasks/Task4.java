package com.eric.lab4_tast3.tasks;

public class Task4 {

    public static void main(String[] args) {
        var a = 2.6;
        var b = 5;
        var S = (double) 0;

        for (var x = (double) 0; x <= 10; x += 0.5) {
            if (x < 2) S = a + (b / Math.pow(Math.E, x)) + Math.cos(x);
            if (x >= 6) S = (a + b) / (x + 1);
            if (x >= 2 && x < 6) S = Math.pow(Math.E, x) + Math.sin(x);
            System.out.println(S);
        }
    }
}