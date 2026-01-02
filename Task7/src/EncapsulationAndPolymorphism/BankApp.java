package EncapsulationAndPolymorphism;

public class BankApp {

    public static void main(String[] args) {

        //  Encapsulated Bank Account
        BankAccount account = new BankAccount();

        account.setAccountNumber(1234567890L);
        account.setAccountHolderName("Shreyash Devtarase");
        account.setBalance(5000);

        account.deposit(2000);     // valid
        account.withdraw(1000);    // valid
        account.withdraw(10000);   // invalid

        System.out.println("\nAccount Details:");
        System.out.println("Account No: " + account.getAccountNumber());
        System.out.println("Holder Name: " + account.getAccountHolderName());
        System.out.println("Balance: ₹" + account.getBalance());

        // Immutable Bank Policy
        BankPolicy policy = new BankPolicy("RBI-2025", "Minimum balance ₹1000");

        System.out.println("\nBank Policy:");
        System.out.println("Policy Code: " + policy.getPolicyCode());
        System.out.println("Policy Rule: " + policy.getRule());
    }
}

// Encapsulation
class BankAccount {

    // Private variables
    private long accountNumber;
    private String accountHolderName;
    private double balance;

    // Getters
    public long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // Setters with validation
    public void setAccountNumber(long accountNumber) {
        if (accountNumber > 0) {
            this.accountNumber = accountNumber;
        }
    }

    public void setAccountHolderName(String name) {
        if (name != null) {
            this.accountHolderName = name;
        }
    }

    public void setBalance(double balance) {
        if (balance >= 1000) { // minimum balance validation
            this.balance = balance;
        } else {
            System.out.println("Initial balance must be at least ₹1000");
        }
    }

    // Business methods
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₹" + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn ₹" + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

// Immutable Class
final class BankPolicy {

    private final String policyCode;
    private final String rule;

    public BankPolicy(String policyCode, String rule) {
        this.policyCode = policyCode;
        this.rule = rule;
    }

    // Only getters
    public String getPolicyCode() {
        return policyCode;
    }

    public String getRule() {
        return rule;
    }
}