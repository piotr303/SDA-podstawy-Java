package com.sda.warunki;

import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        // program pobiera 3 długości boków i sprawdza czy można stworzyć trójkąt
        // suma każdych dwóch boków musi być większa od trzeciego

        Scanner input = new Scanner(System.in);
        int bok1,bok2,bok3;
        System.out.println("proszę podać trzy wartości");
        bok1 = input.nextInt();
        bok2 = input.nextInt();
        bok3 = input.nextInt();

        if (((bok1 + bok2)>bok3)&&((bok2 + bok3)>bok1)&&((bok3 + bok1)>bok2)){
            System.out.println("Można trójkąt");
        } else {
            System.out.println("Nie dla trójkąta");
        }



    }
}
