/*Write a Java program that takes a year from the user and print whether that
year is a leap year or not. */



package Practice;

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("enter year:");
        int year = sc.nextInt();

        boolean A = (year % 4)==0;
        boolean B  =(year % 100) !=0;
        boolean C =((year % 100 !=0)&&(year % 400 ==0));


        if(A && (B || C)){
            System.out.println(year +"is a leap year");
        }
        else{
            System.out.println(year + "is not a leap year");
        }
    }
    
}
