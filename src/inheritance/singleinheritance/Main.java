package inheritance.singleinheritance;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Alice",29999);
        Manager manager = new Manager("John", 80000, 10);
        employee.displayDetails();
        manager.displayDetails();
    }
}
