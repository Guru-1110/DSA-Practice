@FunctionalInterface
interface A{
    int add(int a, int b);
}
public class Lamdareturn{
    public static void main(String[] args){
        A obj = (int a, int b) ->a+b;
    

        int result = obj.add(5,97);
        System.out.print(result);

    }
}