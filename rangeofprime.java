 public class rangeofprime {
    public static boolean isprime(int n){
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void primeinrange(int n){
        for(int i=2;i<=n;i++){
            if(isprime(i)){
                System.out.print(i+ " ");

            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        primeinrange(20);
    }
 }
