package task2.a;

class Worker extends Employee{
    double deduction;

    Worker(){
        this.deduction = 5000;
    }

    @Override
    public double calculateSalary(){
        return (super.calculateSalary() - deduction);
    }
}
