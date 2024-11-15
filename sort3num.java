public class sort3num {
    public static void sort3(int [] arr){
        int n=arr.length;
        int i=0;
        int k=n-1;
        int j=0;
        while(j<=k){
            if(arr[j]==0){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;
                j++;
            }
            else if(arr[j]==2){
                int temp=arr[k];
                arr[k]=arr[j];
                arr[j]=temp;
                k--;

            }
            else{
                j++;
            }

        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {
        int a[]={0,2,2,1,0,2,1};
        sort3(a);
    }
    
}

