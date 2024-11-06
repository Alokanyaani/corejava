//Write a Java program to swap two variables.


package Practice;

import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b,temp;
        //Print the values before swapping.
        System.out.println("Enter first num: ");
         a = sc.nextInt();

        System.out.println("Enter second num: ");
         b = sc.nextInt();

          temp = a;
          a = b;
          b = temp;
        //Print the values after swapping.
        System.out.println("Enter first num: " + a);
        System.out.println("Enter first num: " + b);

        
    }
    
    
}
