class Student{
    int age;
    String name;
    int roll_no;
    Student(int a, String b, int c){
        age = a;
        name = b;
        roll_no = c;
        System.out.print("Age: " + age + " " + "Name: " + name + " " + "Roll No: " + roll_no);
    }
}
public class constructor{
    public static void main(String[] args){
        Student s1 = new Student(20, "Guru", 1184);

    }

}