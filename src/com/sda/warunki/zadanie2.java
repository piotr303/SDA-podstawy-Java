package com.sda.warunki;

import java.util.Scanner;

public class zadanie2 {
    public static void main(String[] args) {

        int Number;
        Scanner input = new Scanner(System.in);
        Number = input.nextInt();

        if (Number % 2 == 0) {
            System.out.println("Liczba jest parzysta");
        } else {
            System.out.println("liczba jest nieparzysta");
        }
    }
}