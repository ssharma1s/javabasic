package inheritance.singleinheritance;

public class Employee {
    String name;
    double salary;

    public Employee(String name,double salary) {
        this.name = name;
        this.salary = salary;
    }
//    public Employee(){};

    public void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
