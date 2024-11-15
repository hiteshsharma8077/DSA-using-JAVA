public class pairthearrays {
  
public static void pairs(int [] arr){
   int  n=arr.length;
System.out.print("now the pairs are : ");
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            System.out.print("( "+arr[i]+" , "+arr[j]+" ) ,  ");
        }
    }
}



    public static void main(String[] args) {
        int a[]={2,3,45,78};
       pairs(a); 
    }
}
