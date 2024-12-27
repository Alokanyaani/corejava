// Q.6:- write a program to swap two numbers without using a third variable.



package Question;

import java.util.Scanner;

public class swapvalue2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a,b;

        System.out.println("Enter first number: ");
        a = sc.nextInt();

        System.out.println("Enter second number: ");
        b = sc.nextInt();

        a=a+b;
        b=a-b;
        a=a-b;


        System.out.println("Enter first number: "+a);
        System.out.println("Enter second number: "+b);

    }
}
