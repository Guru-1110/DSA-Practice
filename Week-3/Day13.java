interface Computer{
    void code(); 
}
class Laptop implements  Computer{
    public void code(){
        System.out.println("This is code method");
    }
}
class Desktop implements Computer{
    public void code(){
        System.out.println("faster");
    }
}
class Developer{
    public void Develop(Computer lap)
    {
        lap.code();

    }

}
public class Day13{
    public static void main(String[] args){
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer dev = new Developer();
        dev.Develop(desk);
    }
}