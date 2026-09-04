class A{
    public void show(){
        System.out.println("in A");
    }

}
class B extends A{
    public void show(){
        System.out.println("in B");
    }

}

public class Dynamic{
    public static void main(String[] args){
        A obj = new A();
        obj.show(); 


        obj = new B();
        obj.show();

    }
}