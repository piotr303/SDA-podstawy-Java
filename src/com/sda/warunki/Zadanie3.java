package com.sda.warunki;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {

        int number;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        if (number % 5 == 0 && number % 3 == 0) {
            System.out.println("Liczba jest podzielna przez 5 oraz przez 3");
        } else if (number % 3 == 0) {
            System.out.println("Liczba jest podzielna przez 3");

        } else if (number % 5 == 0) {
            System.out.println("liczba jest podzielna przez 5");
        } else {
            System.out.println("Liczba jest niepodzielna przez 3 oraz przez 5");
        }
    }
}
