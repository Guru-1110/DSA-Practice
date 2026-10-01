import java.util.Scanner;
public class VowelsRepetetion{
    public static void main(String[] args) {
        int a =0;
        int e =0;
        int i =0;
        int o =0;
        int u =0;
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int j=0;j<str.length();j++){
            char ch = str.charAt(j);
            if(ch == 'a'){
                a++;
            }
            else if(ch == 'e'){
                e++;
            }
            else if(ch == 'i'){
                i++;
            }
            else if(ch == 'o'){
                o++;
            }
            else if(ch == 'u'){
                u++;
            }
        }
        char maxvowel = ' ';
        int max = 0;
        if(a>max){
            max = a;
            maxvowel = 'a';
        }      
        if(e>max){
            max = e;
            maxvowel = 'e';
        }
        if(i>max){
            max = i;
            maxvowel = 'i';
        }
        if(o>max){
            max = o;
            maxvowel = 'o';
        }
        if(u>max){
            max = u;
            maxvowel = 'u';
        }
        System.out.print(max+" "+maxvowel);
    }
}