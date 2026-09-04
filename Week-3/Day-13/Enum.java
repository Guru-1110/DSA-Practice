enum Status{
    Running,Pending,Completed,Failed;
}
public class Enum{
    public static void main(String[] args){
        Status[] aa = Status.values();
        for(Status a : aa)
        {
            System.out.println(a+ " " +":"+ a.ordinal());

        } 
        
    }
}