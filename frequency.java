import java.util.*;
class Frequency{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        char ch;
        int length,count;
        count=0;
        System.out.println("enter string");
        str=sc.nextLine();
        str=str.toLowerCase();
        System.out.println("enter character");
        ch=sc.next().charAt(0);
        ch=Character.toLowerCase(ch);
        length=str.length();
        for(int i=0;i<length;i++){
            if(ch==str.charAt(i)){
                count++;
            }
        }
        System.out.println("the character "+ch+"repeats "+count +"times");
    }
}