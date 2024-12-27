//Q.14:-Write a program to display the multiplication table of a number.


package Question;

import java.util.Scanner;

public class table {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num: ");
        int table = sc.nextInt();

        for(int i = 1; i<=10; i++){
            System.out.println(table + " * " +i+ " = " +table*i);
        }
    }
}
