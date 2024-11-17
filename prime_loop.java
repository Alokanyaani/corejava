//check if a number is prime or not.


import java.util.Scanner;

public class prime_loop {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);

    System.out.println("Enter number : ");
    int n= sc.nextInt();

    if(n==2){
        System.out.println("N is prime");
    }else{
        boolean isprime = true;
        for(int i=2; i<=n-1;i++){ //n is a multiple of i (i not equal to 1 or n )
            if(n %i==0){
            isprime= false;
            }


        }
        if(isprime==true){
            System.out.println("N is prime ");

        }else{
            System.out.println("N is not prime");

           }
        }
   }
}
