class human{
    private int age;
    private String name = "Guru";
    public int getage(){
        return age;
    }
    public String getname(){
        return name;
    }
    public void setage(int a){
        age =a;
    }
}
public class Encapsulation{
    public static void main(String[] args){
        human h1 = new human();
        h1.setage(90);
        System.out.print("Age: " + h1.getage() + " " + "name: " + h1.getname());
    }
}