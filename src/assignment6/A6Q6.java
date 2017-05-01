/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author janaz9178
 */
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.println("How many students are in the class?");
        int length = input.nextInt();

        //create array to store the marks to be sorted
        double[] marks = new double[length];

        //for loop to put the marks into the array
        System.out.println("Please enter the marks:");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextDouble();
        }

        //sort the marks from least to greatest
        Arrays.sort(marks);

        //calculate the average of the marks by first finding the sum
        double sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }
        double average = sum / marks.length;

        //output the average, highest, and lowest marks
        System.out.println("The highest mark is " + marks[marks.length - 1]
                + "%, the lowest mark is " + marks[0] + "%, and the average for"
                + " the class is " + average + "%");
    }
}
