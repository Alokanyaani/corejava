//Write a Java program to print the area and perimeter of a circle.

package Practice;

import java.util.Scanner;

public class circle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius: ");
        float radius = sc.nextFloat();

        float area1 = 3.14f * radius * radius;
         System.out.println("Area:" + area1);

         System.out.println("Enter perimeter: ");
         float perimeter = sc.nextFloat();

         float area2 = 2 * 3.14f * perimeter ;
         System.out.println("Perimeter is : " + area2);

        

    }
    
}
