package com.company;

import java.util.Scanner;

public class Main {
    //odczytać 6 stringow i usunąć powtarzalnie słowa
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strings = new String[6];
        for (int i = 0; i < 6; i++) {
            strings[i] = scanner.nextLine();
        }

        for (int i = 0; i < strings.length; i++) {
            String currentString = strings[i];
            for (int j = i + 1; j < strings.length; j++) {
                if (currentString == null) {
                    break;
                }
                if (currentString.equals(strings[j])) {
                    strings[j] = null;
                    strings[i] = null;
                }
            }
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}