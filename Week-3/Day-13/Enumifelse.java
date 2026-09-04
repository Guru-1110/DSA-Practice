enum Status{
    
    PENDING,
    IN_PROGRESS,
    COMPLETED
}
public class Enumifelse {
    public static void main(String[] args) {
        Status s = Status.IN_PROGRESS;

        if(s==Status.IN_PROGRESS){
            System.out.println("Waiting for the process to complete");

        }
        else if(s==Status.COMPLETED){
            System.out.println("Successfully completed");

        }
        else{
            System.out.println("Process is still pending");
        }

        switch(s){
            case PENDING:
                System.out.println("Process is still pending");
                break;
            case IN_PROGRESS:   
                System.out.println("Waiting for the process to complete");
                break;
            case COMPLETED:
                System.out.println("Successfully completed");
                break;
            
        }
    }
}