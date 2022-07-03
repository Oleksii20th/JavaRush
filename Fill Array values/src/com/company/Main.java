package com.company;

import java.util.Arrays;

public class Main {
    //заполнить массив числами якщо длинна массива парна то значення першої valuestart інша valueEnd
// якщо непарна то більша половина valueStart а інша valueEnd

    public static int[] array = new int[19];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        int firstPart = array.length % 2 == 0 ? array.length / 2 : array.length / 2 + 1;
        Arrays.fill(array, 0, firstPart, valueStart);
        Arrays.fill(array, firstPart, array.length, valueEnd);
        System.out.println(Arrays.toString(array));
    }
}
