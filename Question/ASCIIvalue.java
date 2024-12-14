//Q.7:- write a program to find the ASCII value of a character.


package Question;

import java.util.Scanner;

public class ASCIIvalue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character");
        char ch =sc.next().charAt(0);

        int asciivalue= (int)ch;
        System.out.println("ascii value is  "+ asciivalue);
        sc.close();
    }
}
