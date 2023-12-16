package com.eric.lab4_tast3.tasks;

public class Task6 {

    public static void main(String[] args) {
        var sum = 0;

        var i = 0;
        while (i <= 100) {
            sum += 1 / Math.pow(i, 2);
            i++;
        }
        System.out.println("Sum = " + sum);
    }
}