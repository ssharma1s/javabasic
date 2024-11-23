package assignments.addonetohundred;

public class AddOneToHundred {
        public void printSumOneToHundred(){
             int total = 0;

            for (int i=1; i <= 100; i++){
                total = total +i;
            }
            System.out.println("The Sum of 1 to 100 is " + total);
        }

}
