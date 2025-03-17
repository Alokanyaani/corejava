public class kadanes {
    public static void kadanes(int numbers[]){
        int Ms=Integer.MIN_VALUE;
        int Cs=0;

        for(int i=0;i<numbers.length;i++){
            Cs=Cs+numbers[i];
            if(Cs <0){
                Cs=0;
            }
            Ms=Math.max(Cs,Ms);
        }
        System.out.println("our maxSubarray sum is: "+Ms);

    }
    public static void main(String[] args) {
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        kadanes(numbers);

    }
}
