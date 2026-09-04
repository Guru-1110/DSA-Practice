class Laptop{
    int price;
    String model;
    public String toString(){
        return "This is a laptop";
    }
    public Boolean equals(Laptop that){
        if (this.model.equals(that.model) && this.price == that.price){
            return true;
        }
        else{
            return false;
        }
    }
}
public class object{
    public static void main(String[] args){
        Laptop obj = new Laptop();
        obj.model = "Dell";
        obj.price = 1000;
        Laptop obj1 = new Laptop();
        obj1.model = "Dell";
        obj1.price = 1000;
        System.out.println(obj.equals(obj1)); // this will call the equals() method of the Laptop class
         // this will call the toString() method of the Laptop class
    }
}