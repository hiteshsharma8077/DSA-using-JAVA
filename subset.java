import java.util.*;
public class subset {
    public static void subsetarr(int []arr,ArrayList<Integer>list){
        list.add(ans);
        if(arr.length==0){
            return;
        }
        for(int i=0;i<arr.length;i++){
            powerset(s.substring(i+1),ans+s.charAt(i),list);
        }
       
    }
    public static void powerset(String s,String ans,ArrayList<String>list){
        
        list.add(ans);
        if(s.length()==0){
            return;
        }
        

        for(int i=0;i<s.length();i++){
            powerset(s.substring(i+1),ans+s.charAt(i),list);
        }
       
    }

    public static void main(String[] args) {
        String s="abcd";
        int arr[]={1,4,7,8};
        ArrayList<String>list=new ArrayList<>();
        powerset(s,"",list);
        //System.out.println(list);

    }
}
