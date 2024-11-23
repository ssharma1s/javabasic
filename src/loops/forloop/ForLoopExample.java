package loops.forloop;

public class ForLoopExample {
    public void printNumber(){
        for (int i=0; i < 10; i++){
        System.out.println(i);
        }
    }

    public void printNumberWithDecrement(){
        for (int i=9; i >= 0; i--){
            System.out.println(i);
        }
    }

    public void printTable(){
        int number =5;
        for (int i=1; i <= 10; i++){
            System.out.println(number +"*" + i + "=" + (number*i));
        }
    }
}
