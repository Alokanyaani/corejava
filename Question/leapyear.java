//Q.11:-Write a program to check whether a year is a leap


package Question;

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter year: ");
        int year = sc.nextInt();

        boolean a = (year %4 )== 0;
        boolean b= (year %100)!=0;
        boolean c =((year %100) !=0&&(year %400 ==0));

        if(a&&(b||c)){
            System.out.println(year+ " is a leap year");

        }
        else {
            System.out.println(year +" is not leap year");
        }
    }
}
