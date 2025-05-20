public class EvenSum_OddSum {
    public static void main(String[] args) {

        int evenSum=0;
        int oddSum=0;

        for(int i=10;i<=50;i++) {
            if(i%2==0) {
                evenSum=evenSum+i;
            }else {
                oddSum=oddSum+i;
            }
        }
        System.out.println(evenSum +"\n"+oddSum);

    }

}
