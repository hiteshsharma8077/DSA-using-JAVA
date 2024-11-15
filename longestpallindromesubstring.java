public class longestpallindromesubstring {
    // public static int evenpalindrome(String a){
    //     int 
    // }
    public static int oddpalindrome(String a){
        int j=2;
        int i=0;
        int max=0;
        int k=0;
        while(j<a.length()&&i>=0){
            if(a.charAt(i)==a.charAt(j)){
                int len=j-i+1;
                if(len==3){
                    k=i;
                }
                if(len>max){
                    System.out.println(len);
                    max=len;
                }

                i=i-1;
                j=i+2;

            }
            else{
                i=k+1;
                j=i+2;
                k=i;
            }


        }
        return max;
    }
    public static void main(String[] args) {
        String s="sdfabcdeaed";
        int max1=oddpalindrome(s);
        //int max2=evenpalindrome(s);
       System.out.print(max1); 
    }
}
