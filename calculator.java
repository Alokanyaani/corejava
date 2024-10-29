import java.util.Scanner;




public class calculator {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int A = sc.nextInt();

        System.out.println("Enter second number:");
        int B = sc.nextInt();

        System.out.println("operators");
        char operators =sc.next().charAt(0);

        switch(operators){
            case '+' : System.out.println(A + B);
                      break;
            case '-' : System.out.println(A - B);
                      break;
            case '*' : System.out.println(A * B);
                    break;
            case '/' : System.out.println(A / B);
                     break;
            case '%' : System.out.println(A % B);
                     break;         

        }


    }
    
}
