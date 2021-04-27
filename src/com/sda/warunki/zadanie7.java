package com.sda.warunki;

import java.util.Scanner;

public class zadanie7 {
    public static void main(String[] args) {
        System.out.println("Proszę podać 2 wartości");
        Scanner input = new Scanner(System.in);
        Double A = input.nextDouble();
        Double B = input.nextDouble();
        System.out.println("Proszę wybrać znak działania +, -, *, /, ^, pierwiastek.");
        String C = input.next();

        switch (C) {
            case "+": {
                System.out.println(A+B);
                break;
            }
            case "-": {
                System.out.println(A-B);
                break;
            }
            case "*": {
                System.out.println(A*B);
                break;
            }
            case "/": {
                System.out.println(A/B);
                break;
            }
            case "^": {
                System.out.println(Math.pow(A,B) );
                break;
            }
            case "pierwiastek": {
                System.out.println(Math.pow(A,1/B));
                break;
            }
            default: {
                System.out.println("Error");
                break;
            }
        }
    }
}
