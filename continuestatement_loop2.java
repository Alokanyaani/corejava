//display number entered by user except multiples of 10.


import java.util.Scanner;

public class continuestatement_loop2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Enter your number : ");
            int n = sc.nextInt();

            if(n%10==0){
            continue;

        }
        System.out.println(n);
       
       } while(true);
    }
}
