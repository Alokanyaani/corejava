/*: Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
an eraser. You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem */





package Practice;

import java.util.Scanner;

public class tax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter pencil bill:  ");
        float pencil = sc.nextInt();

        System.out.println("Enter pen bill: ");
        float pen = sc.nextInt();

        System.out.println("Enter eraser bill: ");
        float eraser = sc.nextInt();

        float total = pencil + pen + eraser;

        System.out.println("bill is: " + total);
        
        float newtotal = total + (0.18f * total);

        System.out.println("bill with 18% tax: " + newtotal);
    }
    
}
