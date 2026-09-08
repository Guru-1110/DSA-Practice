public class whiles{
    public static void main(String[] args) {
        int n = 1;
        int sum = 0;
        int count = 0;
        while(count<50){
            if(n%10==1){
                sum += n;
                count++;
            }
            n += 10;
        }
        System.out.print(sum);
        
    }
}