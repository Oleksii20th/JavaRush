package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxValue = Integer.MIN_VALUE;
        while (scanner.hasNextInt()){
            int x = scanner.nextInt();
            if(maxValue < x){
                maxValue = x;
            }
        }
        System.out.println(maxValue);
    }
}
