import java.util.ArrayList;
import java.util.List;
public class Collect{
    public static void main(String[] args){
        List <Integer> c = new ArrayList<Integer>();
        c.add(10);
        c.add(4);
        c.add(0);
        c.add(1);
        c.add(7);
        System.out.println(c.get(2));
        for(Integer n: c){
            System.out.println(n);
        }

    }
}