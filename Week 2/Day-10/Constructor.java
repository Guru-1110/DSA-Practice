class Human{
    int age;
    String name;
    public Human(int a, String n){
        age = a;
        name = n;
        System.out.println("Human object created with age: " + age + " and name: " + name);
    }
    public Human(){
        age = 10;
        name = "maki";
        System.out.println("name: " + name + " and age: " + age);
    }
}
public class Constructor{
    public static void main(String[] args){
        Human h1 = new Human();
        Human h2 = new Human(90, "Guru");
    }
}