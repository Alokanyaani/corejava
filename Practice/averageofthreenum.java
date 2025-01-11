package Practice;

import java.util.Scanner;

public class averageofthreenum {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter first num: ");
        int n=sc.nextInt();

        System.out.println("enter second num: ");
        int a=sc.nextInt();

        System.out.println("enter third num: ");
        int b=sc.nextInt();

        System.out.print("the average value is: "+aveofnum(n,a,b));


    }
    public static int aveofnum(int n,int a,int b){
        return (n+a+b)/3;
    }

}
