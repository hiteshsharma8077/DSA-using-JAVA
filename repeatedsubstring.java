public class repeatedsubstring {
    public static void main(String[] args) {

        String s[]={"flower","flow","float","fly"};
        int n=s.length;
        String sub=""+s[0];
        for(int i=1;i<n;i++){
            while(sub.length()>0){
                if(s[i].indexOf(sub)>=-1){
                    break;
                }
                else{
                    sub.substring(0, sub.length()-1);
                }
            }
            

        }
        System.out.println(sub);
    }
    
}
