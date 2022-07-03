package com.company;

import java.util.Scanner;
// odczytać sumu 3 liczb z klawiatury od start to end ktore wielokrotne 2(multiple)
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int multiple = scanner.nextInt();

        int sum = 0;
        for (int i = start; i < end; i++) {
            if (i % multiple != 0) {
                continue;
            }
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
