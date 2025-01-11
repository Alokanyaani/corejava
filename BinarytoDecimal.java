
public class BinarytoDecimal {
    public static void binTodec(int BinNum){
        int mynum =BinNum;
        int pow =0;
        int decNum =0;

        while (BinNum>0){
            int lastdigit=BinNum % 10;
            decNum=decNum+(lastdigit*(int)Math.pow(2,pow));
            pow++;
            BinNum=BinNum/10;

        }
        System.out.println("Decimal of "+ mynum +" = "+decNum);
    }

    public static void main(String[] args) {
        binTodec(111);
    }
}
