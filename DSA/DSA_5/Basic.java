public class Basic{
    public static void main(String[] args) {
        int n = 87824;
        int last_digit = 0;
        int count = 0;
        while(n>0){
            last_digit = n%10;
            n = n/10;
            count += last_digit;
            
        }
        System.out.print(count);
    }
}