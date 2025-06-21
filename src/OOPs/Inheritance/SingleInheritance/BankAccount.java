package OOPs.Inheritance.SingleInheritance;

public class BankAccount {

    int accountNumber;
    double balance;
    public void AccountInfo(){
        System.out.println("Account number : " +accountNumber);
        System.out.println("Balance : " +balance);
    }
}

class SavingsAccount extends BankAccount{
    double interestRate;
    int timeperiod;

    public double calcutateInterest(){
        return (balance * interestRate * timeperiod) / 100;
    }
    public void dispalySavingAccount(){
        System.out.println("Interest rate : " + interestRate);
        System.out.println("Time Period : " + timeperiod);
        System.out.println("Calcutate Interest : " +calcutateInterest());
    }
}

class Programe4 {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();

        savingsAccount.accountNumber = 123456789;
        savingsAccount.balance = 5000.0;
        savingsAccount.interestRate = 3.0;
        savingsAccount.timeperiod = 2;

        savingsAccount.AccountInfo();
        savingsAccount.dispalySavingAccount();


    }

}
