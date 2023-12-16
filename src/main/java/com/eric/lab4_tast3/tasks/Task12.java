package com.eric.lab4_tast3.tasks;

public class Task12 {

    public static void main(String[] args) {
        var Pi = 4.0;
        var pm = -1;
        var i = 3;
        var count = 0;
        var position = 100;
        var formattedPi = 0;

        while (formattedPi != 314159) {
            if (pm == -1) {
                Pi -= (double) 4 / i;
                pm++;
            } else {
                Pi += (double) 4 / i;
                pm--;
            }
            i += 2;
            count++;
            formattedPi = (int)( Pi * position);
            if (formattedPi == 314 || formattedPi == 3141 || formattedPi == 31415) {
                System.out.println("Для " + (double)formattedPi/position + " Потребовалось " + count + " Членов ряда");
                position *= 10;
            }
        }
        System.out.println("Для " + (double)formattedPi/position + " Потребовалось " + count + " Членов ряда");
    }
}