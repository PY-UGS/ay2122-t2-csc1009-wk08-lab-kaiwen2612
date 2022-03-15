package Wk8;

import java.util.Scanner;

public class BankDemoTest {
    public static void main(String[] args) throws Exception{
        // Create a CheckingAccount object
        CheckingAccount checkAcct = new CheckingAccount();
        // Create a Scanner object to obtain user input
        Scanner sc = new Scanner(System.in);
        // Obtain deposit amount from user
        System.out.print("Enter amount to deposit: ");
        double depositAmt = sc.nextDouble();
        // Deposit money into account
        checkAcct.deposit(depositAmt);
        // Obtain withdrawal amount from user 
        System.out.print("Enter amount to withdraw: ");
        double withdrawalAmt = sc.nextDouble();
        checkAcct.withdraw(withdrawalAmt);
        //Close Scanner object
        sc.close();
    }
}
