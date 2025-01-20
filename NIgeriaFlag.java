/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nigeriaflag;

/**
 *
 * @author Akeju Ibukun
 */
public class NIgeriaFlag {

    public static void main(String[] args) {
        int height = 7; // Height of the flag (can be adjusted as needed)
        int width = 15; // Width of the flag (can be adjusted as needed)

        // Loop for each row of the flag
        for (int i = 0; i < height; i++) {
            // Nested loop for each column of the flag
            for (int j = 0; j < width; j++) {
                // Check which part of the flag to print
                if (j < width / 3) {
                    System.out.print("G"); // Green part
                } else if (j >= width / 3 && j < 2 * width / 3) {
                    System.out.print("W"); // White part
                } else {
                    System.out.print("G"); // Green part
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
    

