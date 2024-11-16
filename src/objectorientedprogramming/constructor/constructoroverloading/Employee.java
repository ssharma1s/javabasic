package objectorientedprogramming.constructor.constructoroverloading;

public class Employee {
    Integer id;
    String name;
    String department;

    // default constructor
    public Employee() {
        this.id = 0;
        this.name = "Unknown Employee";
        this.department = "Not Assignment";
    }

    //constructor with one parameter
    public Employee(Integer id) {
        this.id = id;
        this.name = "Unknown Employee";
        this.department = "Not Assignment";
    }

    //constructor overloaded with id and name
    public Employee(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.department = "Not Assignment";
    }

    //constructor overloaded with id and name
    public Employee(String name, String department) {
        this.id = 0;
        this.name = name;
        this.department = department;
    }

    // constructor overloaded with all parameters
    public Employee(Integer id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }

}

