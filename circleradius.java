//Q.10:- Write a program to calculate the area of a circle given its radius.


package Question;

import java.util.Scanner;

public class circleradius {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius: ");
        float Radius= sc.nextFloat();

        float area1 = 3.14f *Radius*Radius;
        System.out.println("Radius is: " +area1);

        System.out.println("Enter perimeter: ");
        float perimeter =sc.nextFloat();

        float area2 = 2*3.14f*perimeter;
        System.out.println("Perimeter is: "+ perimeter);
    }

}
