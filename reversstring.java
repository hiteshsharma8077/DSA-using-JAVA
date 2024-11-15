public class reversstring {
   public static void main(String[] args) {
    String a="This is my new string";
    a=a.trim();
    String b="";
    String[] s=a.split(" ");
    for(int i=0;i<s.length/2;i++){
        String temp=s[i];
        s[i]=s[s.length-1-i];
        s[s.length-1-i]=temp;
    }

    for(int j=0;j<s.length;j++){
        b=b+s[j]+" ";
    }
    System.out.println(b);
}

}