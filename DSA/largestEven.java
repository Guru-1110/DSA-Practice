import java.util.Scanner;
public class largestEven{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int largestEven = Integer.MIN_VALUE;
        int SecondEven = Integer.MIN_VALUE;
        int smallestOdd = Integer.MAX_VALUE;
        int secondOdd = Integer.MAX_VALUE;
        for(int i = 0;i<n;i++){
            if(i%2==0){
                if(arr[i]>largestEven){
                    SecondEven = largestEven;
                    largestEven = arr[i];
                }
                else if(arr[i]>SecondEven){
                    SecondEven = arr[i];
                }
            }
            else if(i%2!=0){
                if(arr[i]<smallestOdd){
                    secondOdd = smallestOdd;
                    smallestOdd = arr[i];
                }
                else if(arr[i]<secondOdd){
                    secondOdd = arr[i];
                }
            }
        }
        int result = secondOdd+SecondEven;
        System.out.print(result);
        
    }
}