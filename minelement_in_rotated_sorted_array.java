public class minelement_in_rotated_sorted_array {
    public static int minelement(int arr[]){
        int n=arr.length;
        int beg=0;
        int end=n-1;
        while(beg<=end){
            if(arr[beg]<=arr[end]){
                return arr[beg];
            }
            int mid=(beg+end)/2;
            if(arr[mid]>=arr[beg]){
                    beg=mid+1;
                
            }
            if(arr[mid]<arr[end]){
                end=mid;
            }

        }

        return -1;

    }
    public static void main(String[] args) {
        int [] a={9,2,3,4,5,6,7,8};
        System.out.println(minelement(a));
    }
}
