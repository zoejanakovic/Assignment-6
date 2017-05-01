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
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        //get input for number of students to create the right length array
        System.out.println("How many students are in the class?");
        int length = input.nextInt();

        //create array to store the marks
        double[] marks = new double[length];

        System.out.println("Please enter in their marks");

        //for loop to scan in marks for the array
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextDouble();
        }

        //use for loop to determine the sum
        double sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }

        //calculate average and output
        double average = sum / marks.length;
        System.out.println("The class average is " + average + " %");
    }
}
