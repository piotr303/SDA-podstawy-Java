package com.sda.warunki;

import java.util.Scanner;

public class zadanie5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Proszę podaćliczbę od 1 do 7");
        int number = input.nextInt();

        switch (number) {
            case 1: {
                System.out.println("Poniedziałek");
                break;
            }
            case 2: {
                System.out.println("Wtorek");
                break;
            }
            case 3: {
                System.out.println("środa");
                break;
            }
            case 4: {
                System.out.println("czwartek");
                break;
            }
            case 5: {
                System.out.println("Piątek");
                break;
            }
            case 6: {
                System.out.println("Sobota");
                break;
            }
            case 7: {
                System.out.println("Niedziela");
                break;
            }
            default: {
                System.out.println("Error");
                break;
            }
        }
    }
}