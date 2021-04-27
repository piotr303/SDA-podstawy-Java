package com.sda.zadania;

import java.util.Scanner;

public class zadanie3 {

    public static void main(String[] args) {
        double CEL;
        double FAR;
        System.out.println("Proszę podać temperaturę w stopniach celcjusza");
        Scanner input = new Scanner(System.in);
        CEL = input.nextDouble();


        FAR = 32+1.8*CEL;
        System.out.println("Podana wartość w stopniach Farenhaita");
        System.out.println(FAR);
    }
}
