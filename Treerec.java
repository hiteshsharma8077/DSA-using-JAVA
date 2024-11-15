public class Treerec {
    //when repetition is allowed
    //Q.1 Suppose you have 3 types of candies and in unlimited
    //amout,now you have to distribiute it among students 
    //different ways in which students can get the candies
    //permutation with repetition

    public static void waytosit(String people,String ans){
        if(ans.length()==3){
            System.out.println(ans);
            return ;
        }
        else{
        for(int i=0;i<people.length();i++){
        
            waytosit(people.substring(0,i)+people.substring(i+1),ans+people.charAt(i));
        }
        }
        
    }
    public static void distributed_candies(String option, String ans){

        if(ans.length()==3){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<option.length();i++){
            distributed_candies(option,ans+option.charAt(i));
        }
        // String ans1=ans+option.charAt(0);
        // distributed_candies(option,ans1);
        // String ans2=ans+option.charAt(1);
        // distributed_candies(option,ans2);
        // String ans3= ans+option.charAt(2);
        // distributed_candies(option,ans3);

    }
   public static void main(String[] args) {
    //distributed_candies ("abc","");
    waytosit("abc","");
   } 
}
