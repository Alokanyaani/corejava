/*write a Java program to get a number from the user and print whether it is
positive or negative.
 */ 






package Practice;
import java.util.Scanner;

public class prt8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Input number:");
        int whether = sc.nextInt();

        if(whether <0){
            System.out.println(" Number is negative");
        }
         else if(whether >0){
            System.out.println(" Number is positive");

         }
         else{
            System.out.println("Number is zero");
         }


    }
    
}
