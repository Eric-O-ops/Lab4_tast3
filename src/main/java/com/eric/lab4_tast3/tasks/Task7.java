package com.eric.lab4_tast3.tasks;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var a = input.nextDouble();
        var sum = 0;

        var i = 1;
        do {
        sum += 1/i;
        i++;
        } while (sum>a);

        System.out.println("Sum = " + sum);
    }
}