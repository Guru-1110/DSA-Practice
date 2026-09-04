// final variable cannot be changed once it is initialized
// final  method cannot be overridden
//final class cannot be inherited

public class keyword{
    public static void main(String[] args){
        final int a = 10;
        a = 20; // this will give an error because a is final and cannot be changed

    }
}