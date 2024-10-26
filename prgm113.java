import java.util.Scanner;


public class prgm113 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter first number:");
        int A = sc.nextInt();

        System.out.println("Enter second number:");
        int B = sc.nextInt();

        System.out.println(" Enter third number");
        int C = sc.nextInt();
        
        int middel;
        if((A > B && A < C) || (A > C && A < B))  {
             middel = A;

        }
        else if ((B > A && B < C) || (B > C && B < A)) {
            middel = B;

        }
         else {
            middel = C;
         }
         System.out.println("middel number:" + middel);
    }   

    
    
}
