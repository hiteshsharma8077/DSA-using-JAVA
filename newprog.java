public class newprog {
    public static void main(String[] args) {
        String s="11188922211999";
        int count =1;
        String ans="";
        for(int i=0;i<s.length()-2;i++){
            char curr = s.charAt(i); 
        if(curr==s.charAt(i+1)){
            count++;
    
        }
        else{
            ans = ans + count+""+ curr;
            count=1;
        }
        
        
        }
        ans=ans+count+s.charAt(s.length()-1);
        System.out.print(ans);
    }
}
