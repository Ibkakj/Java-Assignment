/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nigeriaflag;

/**
 *
 * @author Akeju Ibukun
 */
import java.util.Scanner;
public class TwoDArrayInput {
       public static void main(String[] args) {
        // Declare a 2D array of size 10x10
        int[][] array = new int[10][10];
        Scanner scanner = new Scanner(System.in);

        // Loop to accept user input and assign values to the 2D array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                // Ask the user to input a value for each index
                System.out.print("Enter a value for element at [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        // Using a for-each loop to print the elements of the 2D array
        System.out.println("\nValues entered by the user:");
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + "\t"); // Tab space for formatting
            }
            System.out.println(); // Move to the next line after each row
        }

        // Close the scanner
        //scanner.close();
    }
}