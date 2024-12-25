 //Q.3 :- Write a java program to check whether a number is even or odd.


package Question;

import java.util.Scanner;

public class weatherevenodd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter weather: ");
        int A= sc.nextInt();
        if(A%2 ==0) {
            System.out.println( "Weather is even" );
        }
        else{
            System.out.println("Weather is odd" );
        }
    }
}
