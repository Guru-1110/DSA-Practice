import java.util.*;
public class Anagram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
       // s1 = s1.replaceAll("\\s","").toLowerCase();
    //    s2 = s2.replaceAll("\\s","").toLowerCase();
        if(s1.length()!=s2.length()){
            System.out.print("Not an Anagram");
        }
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            System.out.print("It is a Anagram");
        }
        else{
            System.out.print("not a Anagram");
        }
    }
}