package com.sda.zadania;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        double cm;
        double inch;
        System.out.println("proszę podać liczbę");
        Scanner input = new Scanner(System.in);
        cm = input.nextDouble();

        inch = cm/2.54;
        System.out.println(inch);


    }
}
