package com.eric.lab4_tast3.tasks;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        var sum = 0;
        var product = 1;
        var input = new Scanner(System.in);

        var i = 1;
        do {
            var n = input.nextDouble();
            sum += n;
            product *= n;
            i++;
        } while (i <= 10);

        System.out.println("product = " + product + "\n sum = " + sum);
    }
}
