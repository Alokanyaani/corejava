import java.util.Scanner;




public class prgm114 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int number = sc.nextInt();

        if(number % 2 ==0){
            System.out.println("EVEN NUMBER");

        }
        else{
            System.out.println("ODD NUMBER");
        }

    }
    
}
