 //Q.1:- write a program to swap two numbers using a third variable.

package Question;

import java.util.Scanner;

public class swapvalue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a,b,temp;

        System.out.println("Enter first number: ");
        a= sc.nextInt();

        System.out.println("Enter second number: ");
        b= sc.nextInt();

        temp =a;
        a=b;
        b=temp;
        System.out.println("Enter first number: " +a);
        System.out.println("Enter second number: " +b);

    }



}
