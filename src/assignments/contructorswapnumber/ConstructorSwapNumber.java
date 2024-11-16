package assignments.contructorswapnumber;

public class ConstructorSwapNumber { // define class
    int firstNumber; //class variables
    int secondNumber;

    public ConstructorSwapNumber(int firstNumber, int secondNumber) { //declare constructor -- also the parameters are passed
        this.firstNumber = firstNumber; // this represents class variable, the other variable represents the parameter
        this.secondNumber = secondNumber;

    }
    public void getSwapNumber() { // this represents class variable, the other variable represents the parameter
        int temp = firstNumber; //temp variable is created to hold the value of the class variable temporarily
        firstNumber = secondNumber;
        secondNumber = temp;
    }

}

