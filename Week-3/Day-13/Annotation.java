class A{
    public void mathisthetoughestsubject(){
        System.out.println("Math is the toughest subject");
    }
}
class B extends A{
    @Override
    public void mathisthetoughestsubject(){
        System.out.println("Hello");
    }

}
public class Annotation{
    public static void main(String[] args){
        B obj = new B ();
        obj.mathisthetoughestsubject();
    }
}