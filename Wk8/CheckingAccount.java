package Wk8;

public class CheckingAccount {
    private double balance;
    private String acctNum;

    public CheckingAccount() {}

    public String getAcctNum() {
        return this.acctNum;
    }

    public double getBalance() {
        return this.balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException{
        if (amount < 0 || amount == 0) {
            System.out.println("Amount to withdraw is invalid");
            throw new IllegalArgumentException();
        }
        else {
            if (amount > this.balance) {
                double shortageAmt = amount - this.balance;
                System.out.println("Sorry, but your account is short by: $ " + shortageAmt);
                throw new InsufficientFundsException(amount);
            }
            this.balance = this.balance - amount;
            System.out.println("The balance after withdrawal is: $ " + this.balance);
        }
    }

    public void deposit(double amount) {
        if (amount < 0 || amount == 0) {
            System.out.println("Amount to deposit is invalid");
            throw new IllegalArgumentException();
        }
        else {
            this.balance = this.balance + amount;
            System.out.println("You now have $ " + this.balance + " in your account");
        }
    }
}
 