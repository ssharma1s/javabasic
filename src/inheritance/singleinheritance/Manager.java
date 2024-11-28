package inheritance.singleinheritance;

public class Manager extends Employee{
    int teamSize;

    public Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

//    public Manager(int teamsize){
//        this.teamSize = teamsize;
//
//    }
    //annotation
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }

}
