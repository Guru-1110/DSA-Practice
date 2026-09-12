public class Pattern15{
    public static void main(String[] args) {
        int n = 4;
        for(int i = 1; i <= n; i++){
            char ch = 'A';
            for(int j = n; j>=i; j--){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}