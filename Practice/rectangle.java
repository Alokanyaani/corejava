//Write a Java program to print the area and perimeter of a rectangle.

package Practice;

import java.util.Scanner;

public class rectangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter width: ");
        float width = sc.nextFloat();

        System.out.println("Enter Height: ");
        float Height = sc.nextFloat();

        float area1 = width*Height;
        System.out.println("Area is: "+ area1);

        float perimeter = 2*width + 2*Height;
        System.out.println("perimeter is: " + perimeter );
    }
}