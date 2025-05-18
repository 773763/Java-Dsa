import java.util.*;
public class javabasics{
    public static int lowervowels(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a string:");
        String str=sc.nextLine();
        //int vowel=lowervowels(str);
        System.out.println("number of lowercase vowels:"+lowervowels(str));
    }
}

