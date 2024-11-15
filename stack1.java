import java.util.*;
public class elementrepeatedtwice {
    public static int[] freq (int [] a){
        int []twice=new int [a.length];
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=a.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(a[i])){
                map.put(a[i],map.get(a[i])+1);
            }
            else{
                map.put(a[i],1);
            }
            

        }
        int k=0;
        for(int j=0;j<n;j++){
            if(map.get(a[j])==2){
                
            }
        }
        return twice;
        


        

    }
    public static void main(String []args){
        int arr[]={1,2,3,4,5,4,3,2,1,3,5,3};
        System.out.println(freq(arr));
    }
    
}
