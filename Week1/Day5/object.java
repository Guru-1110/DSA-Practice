class Mobile{
    String name;
    int price;
    int model_no;
    public void show(){
        System.out.print(name + " " + price + " " + model_no);
    }

}
public class object{
    public static void main(String[] args){
        Mobile m1 = new Mobile();
        m1.name ="Samsung";
        m1.price = 20000;
        m1.model_no = 12345;
        Mobile m2 =new Mobile();
        m2.name = "Iphone";
        m2.price = 50000;
        m2.model_no = 67890;
        m1.show();
    }
}
System.out.print()

