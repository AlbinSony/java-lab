import java.util.*;
class Palindrome{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       String str,rev="";
       System.out.println("enter string");
       str=sc.next();
       int n=str.length();
       for(int i=(n-1);i>=0;i--){
        rev=rev+str.charAt(i);
       }
       System.out.println("reverse of string is "+rev);
       if(str.equalsIgnoreCase(rev)){
        System.out.println("palindrome");
       }
       else{
        System.out.println("not palindrome");
       }
       
    }
}