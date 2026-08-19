public class day5{
    public static void main(String[] args){
        StringBuffer sl = new StringBuffer("Guru");
        sl.append(" Prasath");
        System.out.print(sl.deleteCharAt(6));
    }
}
// StringBuffer is Thread safe and mutable.
//Stringbuilder is not Thread safe and mutable.