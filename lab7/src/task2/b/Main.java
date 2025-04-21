package task2.b;


public class Main{

    public static void main(String[] args) {
        BankAccount A1 = new BankAccount();
        SavingsAccount S1 = new SavingsAccount();

        System.out.println("Interest of Bank Account: " + A1.getInterestRate()*100 + "%");
        System.out.println();
        System.out.println("Interest of Saving Account: " + S1.getInterestRate()*100 + "%");
    }
}


