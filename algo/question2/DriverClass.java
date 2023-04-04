package com.lab2.algo.question2;
import java.util.Arrays;
import java.util.Scanner;
public class DriverClass {

    public static void main(String[] args) {
        System.out.println("Enter the total number of Currency notes in your Country");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] currency = new int[size];

        System.out.println("Enter the currency denominations value");
        for (int i = 0; i < size; i++) {
            currency[i] = sc.nextInt();
        }
        System.out.println("Befor sorting : " + Arrays.toString(currency));
        MergedSort ms = new MergedSort();
        ms.sort(currency, 0, size - 1);
        System.out.println("After Sorting " + Arrays.toString(currency));
        System.out.println("Enter total amount");

        int amount = sc.nextInt();



        NoteCount noteCount = new NoteCount();

        noteCount.counting(currency,amount);
    }
}
