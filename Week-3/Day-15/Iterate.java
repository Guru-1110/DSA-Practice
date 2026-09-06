
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class Iterate{
    public static void main(String[] args){
        Collection<Integer> c;
        c = new TreeSet<Integer>();
        c.add(10);
        c.add(4);
        c.add(6);
        c.add(1);
        c.add(7);
        Iterator<Integer> it = c.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}