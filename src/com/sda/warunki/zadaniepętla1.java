package com.sda.warunki;

import java.util.Scanner;

public class zadaniepętla1 {
    public static void main(String[] args) {
        System.out.println("proszę podać liczbę");
        Scanner input = new Scanner(System.in);
        int b = input.nextInt();

        for(int i = b; i<=5;i++) {
            System.out.println("Aktualna wartość: " + i);
        }
    }
}
