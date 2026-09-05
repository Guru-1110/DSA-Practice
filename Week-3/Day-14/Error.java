class GuruException extends Exception{
    public GuruException(String str){
        super(str);
    }
}
public class Error{
    public static void main(String[] args){
        int i = 20;
        int j = 0;
        String str = "Guru";
        try{
            j = 18/i;
            if(j==0)
                throw new GuruException("Cant divide by zero");

        }  
        catch(GuruException e){
            System.out.println("can't divide by zero");
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
        System.out.println(j);
        
        System.out.println("Bye");
    }
}