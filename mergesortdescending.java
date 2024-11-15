public class mergesortdescending {
    public static void main(String[] args) {
        int arr1[]={2,6,7,9,10,15};
        int arr2[]={5,12,25,45};
        int brr[]=new int[arr1.length+arr2.length];
        int i=arr1.length-1;//for arr1
        int j=arr2.length-1;//for arr2
        int k=0;//for brr
        while(i>=0&&j>=0){
            if(arr1[i]>=arr2[j]){
                brr[k]=arr1[i];
                i--;
                k++;

            }
            else{
                brr[k]=arr2[j];
                j--;
                k++;
            
            }
        }
            //if both the size of arrays are not equal then remaining array1 will be added by this new while
            while(i>=0){
                brr[k]=arr1[i];
                i--;
                k++;
            }
             //if both the size of arrays are not equal then remaining array2 will be added by this new while

            while(j>=0){
                brr[k]=arr2[j];
                k++;
                j--;
            }
            System.out.print("now the sorted array will be: ");
            for(int el:brr){
                System.out.print(el+",");
            }

        }
        

}
