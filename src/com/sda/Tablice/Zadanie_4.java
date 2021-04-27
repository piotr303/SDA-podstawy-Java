package com.sda.Tablice;

public class Zadanie_4 {
    public static void main(String[] args){
        int[][] macierz1 = {{1, 2, 56, 44},{76,1,55,23},{22,55,80,8},{2,5,77,4}};
        int[][] macierz2 = {{55, 4, 3, 11},{87,29,99,32},{2,43,3,3},{3,7,22,10}};
        int[][] macierz3 = new int[4][4];
        for (int i = 0; i < macierz3.length; i++) {
            for (int j = 0; j < macierz3[i].length; j++) {
                macierz3[i][j]=macierz1[i][j]+macierz2[i][j];
            }
        }
        for (int i = 0; i < macierz3.length; i++) {
            for (int j = 0; j < macierz3[i].length; j++) {
                System.out.print(macierz3[i][j]);
            }
            System.out.println();
    }
}
