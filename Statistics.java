/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nigeriaflag;

/**
 *
 * @author Akeju Ibukun
 */
import java.util.Arrays;
public class Statistics {
    public static void main(String[] args) {
        // Array of values
        int[] data = {2, 5, 5, 9, 4, 7, 0, 9, 6, 11, 12};

        // Calculate mean
        double mean = calculateMean(data);

        // Calculate median
        double median = calculateMedian(data);

        // Calculate standard deviation
        double standardDeviation = calculateStandardDeviation(data, mean);

        // Output results
        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);
        System.out.println("Standard Deviation: " + standardDeviation);
    }

    // Method to calculate mean
    public static double calculateMean(int[] data) {
        int sum = 0;
        for (int num : data) {
            sum += num;
        }
        return (double) sum / data.length;
    }

    // Method to calculate median
    public static double calculateMedian(int[] data) {
        Arrays.sort(data); // Sort the array
        int length = data.length;
        
        // If the length is odd, return the middle element
        if (length % 2 != 0) {
            return data[length / 2];
        } else {
            // If the length is even, return the average of the two middle elements
            return (data[length / 2 - 1] + data[length / 2]) / 2.0;
        }
    }

    // Method to calculate standard deviation
    public static double calculateStandardDeviation(int[] data, double mean) {
        double sum = 0;
        for (int num : data) {
            sum += Math.pow(num - mean, 2);
        }
        return Math.sqrt(sum / data.length);
    }
} 

