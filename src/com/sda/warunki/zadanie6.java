package com.sda.warunki;

import java.util.Scanner;

public class zadanie6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Proszę podać dzień");
        String day = input.next();

        switch (day) {
            case "Poniedziałek": {
                System.out.println("1");
                break;
            }
            case "Wtorek": {
                System.out.println("2");
                break;
            }
            case "Sroda" : {
                System.out.println("3");
                break;
            }
            case "Czwartek": {
                System.out.println("4");
                break;
            }
            case "Piątek": {
                System.out.println("5");
                break;
            }
            case "Sobota": {
                System.out.println("6");
                break;
            }
            case "Niedziela": {
                System.out.println("7");
                break;
            }
            default: {
                System.out.println("Error");
                break;
            }
        }
    }
}