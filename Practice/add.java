/*In a program, input 3 numbers : A, B and C. You have to output the average of
these 3 numbers.
 */



 package Practice;

 import java.util.Scanner;

public class add {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first number:");
        int A = sc.nextInt();
        
        System.out.println("Enter second number:");
        int B = sc.nextInt();

        System.out.println("Enter third number:");
        int C = sc.nextInt();

        int  calculate=( A + B + C ) /3;

        System.out.println( "Solution: "  + calculate);
    }
    
}
