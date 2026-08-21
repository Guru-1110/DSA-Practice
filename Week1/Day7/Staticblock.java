class Student{
    int age;
    String name;
    Student(int a, String b){
        age = a;
        name = b;
        System.out.println("Age: " + age + " " + "Name: " + name);
    }
    static{
        System.out.println("Static_block");
    }
}
public class Staticblock{
    public static void main(String[] args){
        Student s1 = new Student(20, "Guru");
    }
}
//A static block in Java is a block of code that runs automatically once when the class is loaded.
//static block Runs — only once
//constructor runs — every time an object is created