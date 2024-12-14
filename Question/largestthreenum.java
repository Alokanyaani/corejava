package Question;

import java.util.Scanner;

public class largestthreenum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int A= sc.nextInt();

        System.out.println("Enter second number: ");
        int B = sc.nextInt();

        System.out.println("Enter third number: ");
        int C = sc.nextInt();

        if(A>=B  && A>=C) {
            System.out.println("A is largest");
        }
        else if(B>=A && B>=C){
            System.out.println("B is largest");
        }
        else{
            System.out.println("C is largest");
        }




   }
}
