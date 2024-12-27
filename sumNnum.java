//Q.13:-Write a program to find the sum of the first n natural numbers.

package Question;

import java.util.Scanner;

public class sumNnum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num: ");
        int num = sc.nextInt();

        int sum =0;

        for(int i= 1; i<=num; i++){
            sum+=i;
        }
        System.out.println("sum is: " + sum);

    }
}