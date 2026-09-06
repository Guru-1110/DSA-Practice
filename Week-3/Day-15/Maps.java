import java.util.HashMap;
import java.util.Map;

public class Maps{
    public static void main(String[] args){
        Map<String, Integer> student = new HashMap<String, Integer>();
        student.put("Ravi", 19);
        student.put("Ramesh", 23);       
        student.put("Rakesh", 35);
        student.put("Ramesh", 47);
        for(String key:student.keySet()){
            System.out.println(key + ": " + student.get(key));
        }
    }
}