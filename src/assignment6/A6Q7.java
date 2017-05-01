/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6;

/**
 *
 * @author janaz9178
 */
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create array to store nembers 2-1000 and fill it
        double[] list = new double[999];
        int n = 0;
        for (int i = 0; i < list.length; i++) {
            list[i] = 2 + n;
            n++;
        }
        //create variable with a value starting at 2 to be increased
        //to test if numbers are a multiple of it and are therefore not prime
        int p = 2;

        //while loop to keep repeat the test for all the numbers less than 1000
        //for loop to increase i, the spot in the array being tested
        //if statement to change value to 0 if it is a multiple and hasn't already been confirmed
        while (p < 1000) {
            for (int i = p - 1; i < 999; i++) {
                if (list[i] % p == 0 && list[i] != 0) {
                    list[i] = 0;
                } 
            }
            p++;
        }

        System.out.println("All the prime numbers between 2 and 1000 are:");
        //for loop to output the numbers that are prime(not marked as a 0)
        for (int i = 0; i < 999; i++) {
            if (list[i] > 0) {
                System.out.println(list[i]);
            }
        }
    }
}
