package com.eric.lab4_tast3.tasks;

public class Task3 {

    public static void main(String[] args) {
        var a = 0.4;
        var n = 10;
        var t = (double) 0;
        var F = (double) 0;

        for (var i = 1; i <= 10; i++) {
            F = Math.sin((double) (i * i + 1) / n);
            if (F > 0) {
                t = a*Math.sin((double) (i * i + 1) / n);
            } else  {
                t = Math.cos(i+((double) 1 /n));
            }
            System.out.println(t);
        }
    }
}