package com.eric.lab4_tast3.tasks;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {
        var n = 0;
        var x = 0.0;
        var sum = 0.0;
        var input = new Scanner(System.in);

        System.out.println("Введите n");
        n = input.nextInt();
        System.out.println("Введите x");
        x = input.nextDouble();

        for (var i = 1; i<=n; i++) {
            sum += 1/Math.pow(Math.sin(x), i);
        }

        System.out.println("Sum = " + sum);
    }
}