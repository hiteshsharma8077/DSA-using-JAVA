public class binomialcoeff {
    public static int fact(int a){
        if(a==0){
            return 1;
        }
        else{
            return a*fact(a-1);
        }

    }

    public static int binom(int n,int r){
        int nfact=fact(n);
        int rfact=fact(r);
        int nrfact=fact(n-r);

        int binomialcoeffi=nfact/(nrfact*rfact);
        return binomialcoeffi;

    }
    public static void main(String [] args){

        System.out.println(binom(5,3));
    

    }
    
}
