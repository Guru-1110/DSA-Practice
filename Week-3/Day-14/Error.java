public class Error{
    public static void main(String[] args){
        int i = 0;
        int j = 0;
        try{
            j = 20/i;
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
        System.out.println(j);
        
        System.out.println("Bye");
    }
}