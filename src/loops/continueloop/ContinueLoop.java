package loops.continueloop;

public class ContinueLoop {
    public void performContinueLoop(){

        for (int i = 1; i <= 5; i++){

            if(i ==3) {
                continue;// if we want to skin an iteration, we use continue-- now 3 will be skipped
            }
            System.out.println("Number: " +i);
        }

    }
}
