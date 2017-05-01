/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6;

import java.util.Scanner;

/**
 *
 * @author janaz9178
 */
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        //get number of people to create the right length of array
        System.out.println("How many people are there?");
        int length = input.nextInt();
        double[] heights = new double[length];

        System.out.println("What are their heights measured in feet?");
        //for loop to get heights and put them into the array
        for (int i = 0; i < heights.length; i++) {
            heights[i] = input.nextDouble();
        }

        //for loop to find the sum of the marks
        double sum = 0;
        for (int i = 0; i < heights.length; i++) {
            sum = sum + heights[i];
        }

        //calculate average
        double average = sum / heights.length;
        System.out.println(" ");
        System.out.println("The group's average height is " + average);
        System.out.println(" ");

        //for loop to print out the heights that are above average
        System.out.println("The height(s) above average are:");
        for (int u = 0; u < heights.length; u++) {
            if (heights[u] > average) {
                System.out.println(heights[u]);
            } else if (heights[u] <= average) {
            }
        }
    }
}
