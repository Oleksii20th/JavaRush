package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String text = " любит меня";
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        while (number < 10){
            System.out.println(str + text);
            number++;
        }
    }
}
