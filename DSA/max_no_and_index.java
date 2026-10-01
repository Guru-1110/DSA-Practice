import java.util.Scanner;
public class max_no_and_index{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0;i<n; i++){
            arr[i] = sc.nextInt();
        }
        int index = 0;
        int Max = arr[0]; //i am using arr[0] becaase if i put simply 0 in there this would be wrong for negative no like -1,-5,-8 so we are using arr[0]
        for(int i = 0; i<n; i++){
            if(arr[i]>Max){
                Max = arr[i];
                index = i;
            }
        }
        System.out.print("Largest no: "+Max+" "+"Index no: "+index);
    }
}