/*In a program, input the side of a square. You have to output the area of the
square. */



package Practice;

import java.util.Scanner;

public class side {
    public static void main(String[] args) {
        
    
     Scanner sc = new Scanner(System.in);
     System.out.println("enter side");
     int side = sc.nextInt();

     int area = side*side;

     System.out.println("area of square is: " +area);
    }
}
