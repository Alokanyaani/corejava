// Write a Java program that takes three numbers as input to calculate and print the average of the numbers.


package Practice;

import java.util.Scanner;

public class average{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st num: ");
        int A = sc.nextInt();

        System.out.println("Enter 2nd num: ");
        int B = sc.nextInt();

        System.out.println("Enter 3rd num: ");
        int C = sc.nextInt();

        int average = A + B + C /3;

        System.out.println("average of three num: " + average);
    }
   

}