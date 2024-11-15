public class tocheckstringrotation {
    public static void main(String [] args){
        String s1="acdeb";
        String s2="debac";
    
    if(s1.length()==s2.length()){
        s2=s2+s2;
        if(s2.indexOf(s1)>=0){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
    else{
        System.out.println("no");
    }

}
}
