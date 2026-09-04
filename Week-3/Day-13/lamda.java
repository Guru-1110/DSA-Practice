@FunctionalInterface //
interface A{
    void show(int a);
}

public class lamda{
    public static void main(String[] args){
        A obj = (int a) -> System.out.print("in show"+" "+a);
        obj.show(5);
    }
}