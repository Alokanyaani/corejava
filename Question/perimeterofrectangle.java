//Q.9:-Write a program to calculate the area and perimeter of a rectangle.


package Question;

import java.util.Scanner;

public class perimeterofrectangle {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter width: ");
        float Width=  sc.nextFloat();

        System.out.println("Enter height: ");
        float height= sc.nextFloat();

        float area= Width*height;
        System.out.println("area of rectangle: "+area);

        float perimeter = 2*Width+2*height;
        System.out.println("Perimeter of rectangle: " +perimeter);

       
    }
}
