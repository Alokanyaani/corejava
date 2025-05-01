package Practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class compare_positive_negative_zero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        System.out.println("Enter your num: ");
        int num=sc.nextInt();

        if(num<0) System.out.println("negative number");
         else if (num>0) System.out.println("positive number");
        else System.out.println("zero");



    }
}
