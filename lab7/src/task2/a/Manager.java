package task2.a;

class Manager extends Employee{
    double bonus;

    Manager(){
        this.bonus = 5000;
    }

    @Override
    public double calculateSalary(){
        return super.calculateSalary() + bonus;
    }
}
