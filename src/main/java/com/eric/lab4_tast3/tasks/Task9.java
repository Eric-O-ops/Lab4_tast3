package com.eric.lab4_tast3.tasks;

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {
        var input = new Scanner(System.in);
        int n;
        do {
            System.out.println("Введите натураьное число");
            n = input.nextInt();
        }
        while (n < 0);

        var a = 1.0;
        var sumSin = 0;
        var sumCos = 0;
        var c = Math.pow(2, 0.5);
        var d = 1;

        for (var i = 1; i <= n; i++) {
            a *= 1 + ((double) 1 / i * i);
            for (var j = 1; j <= i; j++) {
                sumSin += 1 / Math.sin(j);
                sumCos += Math.cos(j);
                d *= sumCos / Math.pow(sumSin, -1);
            }
            c = Math.pow(2 + c, 0.5);
            System.out.println("a = " + a);
            System.out.println("sumSin = " + sumSin);
            System.out.println("c = " + c);
            System.out.println("d = " + d);
        }
    }
}