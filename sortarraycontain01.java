public class sortarraycontain01 {
    //two pointer approach
    public static void sort(int[]arr)
    {
        int n=arr.length;
        int j=0;
        int i=0;
        while(j<n){
            if(arr[j]==0){
                arr[i]=0;
                i++;
            }
            j++;
        }
        for(int k=i;k<n;k++){
            arr[k]=1;

        }
        for(int ele:arr){
            System.out.print(ele+ " ");
        }
    }
    public static void main(String[] args) {
        int a[]={0,1,0,0,1,0,0,1,1,0};
        sort(a);
    }

    
}
