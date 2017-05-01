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
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.println("How many marks are there to be entered?");
        int length = input.nextInt();

        //create array to store the marks to be sorted
        Integer[] marks = new Integer[length];

        //get the marks put into array to be sorted
        System.out.println("Please enter the marks:");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextInt();
        }

        //sort the array form smallest to largest
        //for loop with x to increase the staring point each time
        //for loop with y to increase the spot after x being compared
        //if statement to check which is greater and switch the value if needed
        for (int x = 0; x < marks.length; x++) {
            for (int y = x + 1; y < marks.length; y++) {
                if (marks[x] > marks[y]) {
                    int xMark = marks[x];
                    int yMark = marks[y];
                    marks[y] = xMark;
                    marks[x] = yMark;
                } else if (marks[x] <= marks[y]) {
                }
            }
        }

        //output the marks from the array in the new order
        System.out.println("The marks sorted from lowest to highest are:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        //determine if the length is even or odd
        //find the middle spot in the array and output the mark
        if (length % 2 == 0) {
            int medianSpot = (length / 2);
            double median = (marks[medianSpot] + marks[medianSpot - 1]) / 2;
            System.out.println("The median of the marks is " + median);
        } else {
            int medianSpot = (length / 2) - 1 / 2;
            System.out.println("The median of the marks is " + marks[medianSpot]);
        }
    }
}
