import java.util.Scanner;
public class IfElse{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        if(n>=90){
            System.out.print("Grade A");
        }
        else if(n>=70){
            System.out.print("Grade B");
        }
        else if(n>=50){
            System.out.print("Grade C");
        }
        else if(n>=35){
            System.out.print("Grade D");
        }
        else{
            System.out.print("Fail");
        }

    }
}