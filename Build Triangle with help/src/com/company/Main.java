package com.company;
// Zadanie 1 : Narysuj :
//8
//88
//888
//8888
//88888
//888888
//8888888
//88888888
//888888888
//8888888888

// Zadanie 2 : Narysuj :
//         8
//        88
//       888
//      8888
//     88888
//    888888
//   8888888
//  88888888
// 888888888
//8888888888

// Zadanie 3: Narysuj
//          8
//         888
//        88888
//       8888888
//      888888888
//     88888888888
//    8888888888888
//   888888888888888
//  88888888888888888
// 8888888888888888888
public class Main {

    public static void main(String[] args) {
        //Zadanie 1
	int[][] triangle = new int[10][10];
//        for (int i = 0; i < triangle.length; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("8");
//            }
//            System.out.println();
//        }
        //Zadanie 2
//        int Space = triangle.length;
//        for (int i = 1; i <= triangle.length; i++) {
//            for (int j = 1; j <= Space-1; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("8");
//            }
//            System.out.println();
//            Space--;
//        }
        //Zadanie 3
        for (int i = triangle.length; i > 0; i--){
            for (int j = i; j>0;j--){
                System.out.print(" ");
            }
            for (int k = 2*(triangle.length -i) +1;k>0;k--)
                System.out.print("8");
            System.out.println();
        }
    }
}
