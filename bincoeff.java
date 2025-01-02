public class bincoeff {
    public static int factorial(int n){
     int f=1;
     for(int i =1;i<=n;i++){
         f=f*i;
     }
     return f;
    }
    public static int bin_coeff(int n,int r){
        int n_fact=factorial(n);
        int r_fact=factorial(r);
        int nmr_fact=factorial(n-r);

        int Bincoeff=n_fact/(r_fact*nmr_fact);
        return Bincoeff;
    }


    public static void main(String[] args) {
        System.out.println(bin_coeff(5,3));

    }
}
