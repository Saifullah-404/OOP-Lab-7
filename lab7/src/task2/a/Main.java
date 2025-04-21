package task2.a;

public class Main{

    public static void main(String[] args) {
        Manager m = new Manager();
        Worker w = new Worker();

        System.out.println("Manager's Current Salary: " + m.calculateSalary());
        System.out.println();
        System.out.println("Worker's Current Salary: " + w.calculateSalary());

    }

}
