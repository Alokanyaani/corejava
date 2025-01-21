//Write a Java method to compute the sum of the digits in an integer.


package Practice;

import java.util.Scanner;

public class addintegernum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your num: ");
        int digit=sc.nextInt();
        System.out.println("sum of digit: "+sumdigit(digit));


    }
    public static int sumdigit(int n){
       int  sumofdigit =0;
        while (n>0){
            int lastdigit=n%10;
            sumofdigit+=lastdigit;
            n/=10;
        }
        return sumofdigit;

    }

}
