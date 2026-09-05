public class Error{
    public static void main(String[] args){
        int i = 2;
        int j = 0;
        int arr[] = new int[5];
        String str = "Guru";
        try{
            j = 20/i;
            System.out.println(str.length());
            System.out.println(arr[1]);
            System.out.println(arr[5]);
        }
        catch(ArithmeticException e){
            System.out.println("Cant divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Know your limits");
        }

        catch(NullPointerException e){
            System.out.println("Null pointer exception");
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
        System.out.println(j);
        
        System.out.println("Bye");
    }
}