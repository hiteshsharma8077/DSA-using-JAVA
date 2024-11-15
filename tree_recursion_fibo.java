public class tree_recursion_fibo {

public static int fibo(int n){
    if(n==1){
        return 1;
    }
    else if(n==0){
        return 0;
    }
    else{
        int term=fibo(n-1)+fibo(n-2);
        return term;
    }
}
    public static void main(String[] args) {
        int result=fibo(5);
        System.out.println(result);
    }
}
