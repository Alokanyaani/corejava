//Write a method named isEven that accepts an int argument. The method should return true if the argument is even, or false otherwise. Also write a program to test your method.


package Practice;

public class truefalseargument{
    public static boolean iseven(int num){
        return num%2==0;
    }

    public static void main(String[] args) {

        System.out.println(iseven(2));
    }
}