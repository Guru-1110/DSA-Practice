import java.util.Scanner;
public class Replace_a_String{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();
        char ch1 = sc.next().charAt(0);
        char ch2 = sc.next().charAt(0);
        int n = str.length();
        if(str == null){
            System.out.print("null");
        }
        if(ch1 == ch2){
            System.out.print(str);
        }
        char[] arr = str.toCharArray();
        for(int i = 0;i<n;i++){
            if(arr[i]==ch1){
                arr[i]=ch2;

            }
            else if(arr[i]==ch2){
                arr[i]=ch1;
            }
        }
        String result = new String(arr);
        System.out.print(result);
    }
    

}