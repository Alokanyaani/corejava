import java.util.Scanner;


public class prgm112 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
    

       System.out.println("Enter your age:");
        int age = sc.nextInt();
        //int age =16;

        if(age >= 18)
        {
            System.out.println("Adult: vote , Drive");
        }

          else if(age > 13 && age < 18)
          {
                System.out.println("teenager");
          }


                else
                {
                    System.out.println("not adult");
                }
            
        
    }


}


