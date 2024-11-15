import java.util.Scanner;
public class binary_Search {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the target element");
        int key=sc.nextInt();
        int arr[]={2,3,7,8,9,14,25,35,46};
        int low=0;
        int high=arr.length-1;
        int flag=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==key){
                System.out.println("target found at index "+mid);
                flag=1;
                break;

            }
            else if(arr[mid]>key){
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }
        if (flag==0) {
            System.out.println("target not found");
        }
        
    



sc.close();
    }
}
