public class mergesortascending  {
    public static void main(String[] args) {
        int arr1[]={2,6,7,9,10,15};
        int arr2[]={5,12,25,45};
        int brr[]=new int[arr1.length+arr2.length];
        int i=0;//for arr1
        int j=0;//for arr2
        int k=0;//for brr
        while(i<arr1.length&&j<arr2.length){
            if(arr1[i]<=arr2[j]){
                brr[k]=arr1[i];
                i++;
                k++;

            }
            else{
                brr[k]=arr2[j];
                j++;
                k++;
            
            }
        }
            //if both the size of arrays are not equal then remaining array1 will be added by this new while
            while(i<arr1.length){
                brr[k]=arr1[i];
                i++;
                k++;
            }
             //if both the size of arrays are not equal then remaining array2 will be added by this new while

            while(j<arr2.length){
                brr[k]=arr2[j];
                k++;
                j++;
            }
            System.out.print("now the sorted array will be: ");
            for(int el:brr){
                System.out.print(el+",");
            }

        }
        


    }
