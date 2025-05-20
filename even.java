//Q.12:- Write a program to print all even numbers between 1 and 50.


package Question;

import java.util.Scanner;

public class even {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        for(int i =1; i<=50; i++){
            if((i%2)==0){
                System.out.println(i);
            }

        }
    }
}
