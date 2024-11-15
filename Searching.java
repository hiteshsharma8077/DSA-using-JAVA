class Searching{

    public static boolean  linearSearch(int []arr, int key){
       for(int i=0;i< arr.length;i++){
        if(arr[i]==key){
            return true;
        }
       } 
       return false;
    }
    public static void main(String[] args) {
        
        //searching
        int arr[] = {2,4,6,8,4,2,47,23};
        boolean result =  linearSearch(arr, 21);

        System.out.println("the result is :" + result );

//          //declar
//          char chArr[] = new char[5];
         
// // dec + ini
//          char []chArr = {'a', 'b', 'c', 'd', 'e'};
   
         
//          int arr[];
//          arr = new int[10];
//          arr = new int[15];

        }
}