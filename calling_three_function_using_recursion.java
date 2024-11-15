public class calling_three_function_using_recursion{

    public static int pattern(int n){
        if(n==1){
            return 1;

        }
        return pattern(n-1)+pattern(n-1)+pattern(n-1);
    }
    public static void main(String[] args) {
       int result=pattern(3) ;
       System.out.println(result);
    }
}