class math{
    public void ptm(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
public class pattern{
    public static void main(String[] args){
        int n = 5;
        math a = new math();
        a.ptm(n);
        int b = 20;
        math a1 = new math();
        a1.ptm(b);
       

    }
}