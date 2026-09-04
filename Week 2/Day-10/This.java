class A{
    public A()
    {
        System.out.println("in a");
    }
    public A(int a)
    {
        System.out.println("in a int");
    }
}
class B extends A{
    public B()
    {
        super();
        System.out.println("in b");
    }
    public B(int a)
    {
        this();// this keyword used to call the constructor of the same class and super() is used to call the constructor of the parent class
        System.out.println("in b int");
    }
}
public class This{
    public static void main(String[] args){
        B b1 = new B(4);
    } 
}