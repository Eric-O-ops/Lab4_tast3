package com.eric.lab4_tast3.tasks;

public class Task11 {

    public static void main(String[] args) {
        String A [] = {
                "My true love sent to me:",
                "2 turtle doves",
                "3 french hens",
                "4 calling birds",
                "5 golden rings",
                "6 geese a laying",
                "7 swans a swimming",
                "8 maids a milking",
                "9 ladies dancing",
                "10 lords a leaping",
                "11 pipers piping",
                "12 drummers drumming",
        };

        for (var i = 1; i<=12; i++) {
            System.out.print("On the ");
            switch (i) {
                case 1 :
                    System.out.print("first");
                    break;
                case 2 :
                    System.out.print("Second");
                    break;
                case 3 :
                    System.out.print("third");
                    break;
                case 4 :
                    System.out.print("fourth");
                    break;
                case 5 :
                    System.out.print("Fifth");
                    break;
                case 6 :
                    System.out.print("sixth");
                    break;
                case 7 :
                    System.out.print("seventh");
                    break;
                case 8 :
                    System.out.print("eighth");
                    break;
                case 9 :
                    System.out.print("ninth");
                    break;
                case 10 :
                    System.out.print("tenth");
                    break;
                case 11 :
                    System.out.print("eleventh");
                    break;
                case 12 :
                    System.out.print("twelfth");
                    break;
            }
            System.out.println(" day of Christmas");

            for (var j = 0; j<i; j++) {
                switch (j) {
                    case 0 :
                        System.out.println(A[j]);
                        break;
                    case 1 :
                        System.out.println(A[j]);
                        break;
                    case 2 :
                        System.out.println(A[j]);
                        break;
                    case 3 :
                        System.out.println(A[j]);
                        break;
                    case 4 :
                        System.out.println(A[j]);
                        break;
                    case 5 :
                        System.out.println(A[j]);
                        break;
                    case 6 :
                        System.out.println(A[j]);
                        break;
                    case 7 :
                        System.out.println(A[j]);
                        break;
                    case 8 :
                        System.out.println(A[j]);
                        break;
                    case 9 :
                        System.out.println(A[j]);
                        break;
                    case 10 :
                        System.out.println(A[j]);
                        break;
                    case 11 :
                        System.out.println(A[j]);
                        break;
                }
            }
            System.out.println("And a partridge in a pear tree\n");
        }
    }
}
