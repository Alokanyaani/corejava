package Question;

import java.util.Scanner;

public class Fahrenheittocelsius {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Fahrenheit value: ");
        float a= sc.nextFloat();

        float b= (a-32) *5/9;

        System.out.println("the celsius value is: " +b);



    }
}
