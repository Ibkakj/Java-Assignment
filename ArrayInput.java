/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Akeju Ibukun
 */
import java.util.Scanner;
public class ArrayInput {
    public static void main(String[] args) {
        // Declare an array of length 10
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);

        // Loop to accept user input and assign to array
        for (int i = 0; i < array.length; i++) {
            // Ask the user to input a value for each index
            System.out.print("Enter a value for index " + i + ": ");
            array[i] = scanner.nextInt();
        }

        // Using a for-each loop to print the elements of the array
        System.out.println("\nValues entered by the user:");
        for (int value : array) {
            System.out.println(value);
        }

        // Close the scanner
        //scanner.close();
    }
}   

