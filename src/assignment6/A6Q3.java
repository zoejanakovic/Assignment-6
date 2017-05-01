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
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        //create array A to store the integers to be sorted
        Integer[] A = new Integer[2];

        //get the integers to be sorted
        System.out.println("Enter two Integers:");
        for (int i = 0; i < A.length; i++) {
            A[i] = input.nextInt();
        }
        
        //sort the integers from least to greatest
        Arrays.sort(A);

        System.out.println("The integers in ascending order are:");
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
    }
}
