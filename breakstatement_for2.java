import java.util.Scanner;


public class breakstatement_for2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        do{
            System.out.print("Enter your number : ");
            int n= sc.nextInt();

            if(n%10==0){
                break;

            }
            System.out.println(n);

        }while(true);

    }
}
