
import java.util.Scanner;

public class array {
    public static void main(String[] args){
        int marks[] =new int[100];
        Scanner sc =new Scanner(System.in);

        //intput/output

        marks[0]=sc.nextInt();//phy
        marks[1]=sc.nextInt();//chem
        marks[2]=sc.nextInt();//maths

        System.out.println("phy : "+marks[0]);
        System.out.println("chem : "+marks[1]);
        System.out.println("maths : "+marks[2]);

        //update
        //marks[2]=100;
       // System.out.println("maths: "+marks[2]);

       // marks[1]=marks[1]+1;
        //System.out.println("chem : "+marks[1]);

        int percentage =(marks[0]+marks[1]+marks[2])/3;
        System.out.println("percentage: "+percentage+"%");

        System.out.println("length or array: "+marks.length);






    }
}
