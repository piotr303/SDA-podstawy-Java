package com.sda.warunki;

import java.util.Scanner;

public class zadaniePętla2 {
    public static void main(String[] args) {
        System.out.println("proszę podać liczbę");
        Scanner input = new Scanner(System.in);
        int a, b = 1;
        a = input.nextInt();

        for(int i = 1; i<=a;i++) {
            b = b*i;
        }
        System.out.println(b);
    }
}

