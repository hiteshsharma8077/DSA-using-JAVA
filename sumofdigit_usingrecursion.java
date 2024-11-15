//wap in which sum of digits 
public class sumofdigit_usingrecursion {
    static int sumOfdigit(int num){
        if(num==0){
            return 0;
        }
        int lastdigit=num%10;
        int sum=lastdigit+sumOfdigit(num/10);
        return sum;
        
    }
    public static void main(String[] args) {
        int num=4352;
        int result= sumOfdigit(num);
        System.out.println(result);
        
    }
    
}
