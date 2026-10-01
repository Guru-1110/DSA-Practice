public class Basic {
    public static void main(String[] args) {
        int n = 1313;
        int reverse = 0;
        int last_digit = 0;
        while(n>0){
            last_digit = n%10;
            reverse = (reverse*10)+last_digit;
            n = n/10;

        }
        System.out.print(reverse);
        
    }
}