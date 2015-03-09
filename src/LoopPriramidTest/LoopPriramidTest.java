/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoopPriramidTest;

import java.util.Scanner;

/**
 *
 * @author M6500
 */
public class LoopPriramidTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        while (i % 2 != 0) {
            i = sc.nextInt();
        }
        printPeramid(i);

    }

    private static void printPeramid(final int max) {
        int i = 1;
        while (i < max) {
            for (int x = 1; x < max - i; x++) {
                System.out.print(" ");
            }
            for (int y = 1; y <= i; y++) {
                System.out.print("*");
                System.out.print("*");
            }
            System.out.println();
            i++;
        }
    }
}
