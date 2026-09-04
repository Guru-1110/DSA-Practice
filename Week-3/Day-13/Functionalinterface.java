@FunctionalInterface //
interface A{
    void show();
}

public class Functionalinterface{
    public static void main(String[] args){
        A obj = new A(){
            public void show(){
                System.out.print("in show");//Anonymous class is a class that is defined and instantiated in a single statement. It does not have a name and is typically used for implementing interfaces or extending classes on the fly. In this case, we are creating an anonymous class that implements the A interface and provides an implementation for the show() method.
            }
        };
        obj.show();
    }
}