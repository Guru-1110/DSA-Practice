class human{
    private int age = 20;
    private String name = "Guru";
    public int getage(){
        return age;
    }
    public String getname(){
        return name;
    }
}
public class Encapsulation{
    public static void main(String[] args){
        human h1 = new human();
        System.out.print("Age: " + h1.getage() + " " + "name: " + h1.getname());
    }
}