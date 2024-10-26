import java.util.Scanner;



public class pr10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("first number:");
        int A = sc.nextInt();

        System.out.println("Second number:");
        int B = sc.nextInt();

        System.out.println("third number: ");
        int C = sc.nextInt();

        int larget;

        if((A >= B) &&(A >= C)){
            System.out.println("A is largest");
        }

            else if (B >= C){
                System.out.println("B is largest");

            }
            else{
                System.out.println("C is largest");
            }

        
    }

    
}
