package objectorientedprogramming.constructor.constructoroverloading;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.displayDetails();
        System.out.println();
        //Using constructor with id
        Employee emp2 = new Employee (101) ;
        emp2.displayDetails();
        System.out.println();// to change the line
        //Using constructor with id and name
        Employee emp3 = new Employee (102,"John Doe");
        emp3.displayDetails();
        System.out.println();
        //Using constructor with name and department
        Employee emp4 = new Employee ("Jane Doe","IT");
        emp4.displayDetails();
        System.out.println();
        //Using constructor with all fields
        Employee emp5 = new Employee (1,"Jane Doe","IT");
        emp5.displayDetails();
    }
}


