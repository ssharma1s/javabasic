package loops.breakloop;

public class BreakLoop{

    public void performBreakLoop(){
        for (int i = 1; i <= 5; i++){
            if (i==3){
                break; // it will break the iteration after this condition is met.
            }
            System.out.println("Number " +i);
        }
    }
}
