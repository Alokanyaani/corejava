//Q.8:-Write a program to convert temperature from Celsius to Fahrenheit.

package Question;

import java.util.Scanner;

public class temperature {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

       System.out.println("Enter the celsius value:- ");
       float A = sc.nextFloat();

       float B=(A*9/5)+32;

       System.out.println("the fahrenheit value is:- " +B);




    }
}
