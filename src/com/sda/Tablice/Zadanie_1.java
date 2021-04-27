package com.sda.Tablice;

import java.util.Random;
import java.util.Scanner;
/* utwórz tablicę przechowującą wartości typu INT, o rozmiarze podanym przez użytkownika:
a) wypełni ją losowymi wartościami
b) zwróć sumę i średnią
c) wyświetla tylko nieparzyste
 */
public class Zadanie_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int a = input.nextInt();
        int losowa = rand.nextInt();
        int[] tablica = new int[a];
    }
}
