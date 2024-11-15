
public class printsubarray {
    //BRUTFORCE CODE
 public static void subar(int[] arr){
    int n=arr.length;
    int sum[]=new int[n*(n+1)/2];
    int c=0;
    int sumb=0;

    for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
            
        for(int k=i;k<=j;k++){
            System.out.print(arr[k] +" ");
            sumb=sumb+arr[k];


        }
        sum[c]=sumb;
        sumb=0;
        c++;
        System.out.println();
        }
        System.out.println();
    }
    System.out.print("sum of the printed subarrays are : ");
    for(int b=0;b<n*(n+1)/2;b++){
        System.out.print(sum[b]+",");
    }
    int maxsum=Integer.MIN_VALUE;
    for(int i=0;i<n*(n+1)/2;i++){
    if(maxsum<sum[i]){
        maxsum=sum[i];

    
 }
 }
 System.out.print("\n"+ maxsum);
}
//prefix sum approach
public static int maxsum(int[] arr){
    int prefix[]=new int[arr.length];
    int n=arr.length;
    int currsum=0;
    int max=Integer.MIN_VALUE;
    prefix[0]=arr[0];
    for(int i=1;i<n;i++){
        prefix[i]=prefix[i-1]+arr[i] ;
    }
    for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
       currsum= i==0?prefix[j]:prefix[j]-prefix[i-1];
       if(currsum>max){
        max=currsum;
       }

    }
}
return max;

}

//kadane's Algorithm
/*+ve + +ve=+ve 
 * +ve + -ve=+ve
 * +ve+-ve =-ve //neglect this condition it can't give maxsum
*/
public static int maxsubsum(int[] arr){
    int n=arr.length;
    int max=Integer.MIN_VALUE;
    int currsum=0;
    for(int i=0;i<n;i++){
        if(currsum<0){
            currsum=0;

        }
        currsum+=arr[i];
        if(currsum>max){
            max=currsum;
        }



    }
    return max;
    
    

}
    
    public static void main(String[] args) {
        int a[]={4,6,5,3,8};
        //brutforce code
        //subar(a);
        // System.out.println(maxsum(a));
        System.out.println(maxsubsum(a));
    
 }   
}
 
