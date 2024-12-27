
import java.util.Scanner;

public class prime2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        int n,count=0;

        System.out.println("Enter your num: ");
         n = sc.nextInt();

         for( int i=1;i<=n;i++ ){
             if(n%i==0){
                 count++;

             }
         }if(count==2){
            System.out.println("prime number");
        }else{
            System.out.println("not prime number");
        }


    }
}
