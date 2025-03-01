
import java.util.Scanner;

public class guessnumber {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);

        int mynum=(int)(Math.random()*100);
        int yournum =0;

        do{
            System.out.println("guess my number: ");
            yournum=sc.nextInt();

            if(yournum ==mynum){
                System.out.println("correct number");
                break;
            }
            else if (yournum>mynum){
                System.out.println("your number is too large");
            }
            else{
                System.out.println("your number is too small");
            }
        }while(yournum>=0);
    }
}
