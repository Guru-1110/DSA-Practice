public class Palindrome {
    public static void main(String[] args) {
        int n = 1331;
        if(n<0){
            System.out.print("false");
            return;
        }
        int l = 0;
        int R = 0;
        int dub = n;
        while(n>0){
            l = n%10;
            n = n/10;
            
            R = (R*10)+l;
        }
        if(R == dub){
             System.out.print("true");
        }
        else{
            System.out.print("false");
        }
        
    }
}
