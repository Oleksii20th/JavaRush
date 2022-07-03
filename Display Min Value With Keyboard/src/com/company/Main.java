package com.company;

import java.util.Scanner;

//znależć minimalną wartość z napisanych liczb z klawiatury

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        while (console.hasNextInt()) {
            int x = console.nextInt();
            if (x < min) {
                min = x;
            }
        }
        System.out.println(min);
    }
}
