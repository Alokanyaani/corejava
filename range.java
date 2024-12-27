//Q.15:-Write a program to reverse a number using a while loop.

package Question;

import java.util.Scanner;

public class range {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("enter num: ");
        int range =sc.nextInt();
        int i =1;
        for(i= 1; i<=range;i++){
            System.out.print(" "+i+" ");
        }
    }
}
