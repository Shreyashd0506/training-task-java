package UsingThreadClass;

public class BankTransactionDemo {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        WithdrawThread t1 = new WithdrawThread(account);
        DepositThread t2 = new DepositThread(account);

        t1.setName("Withdraw-Thread");
        t2.setName("Deposit-Thread");

        t1.start();
        t2.start();
    }
}


class BankAccount {

    private int balance = 1000; // initial balance

    // synchronized method for withdrawal
    synchronized void withdraw(int amount) {

        System.out.println(Thread.currentThread().getName()
                + " wants to withdraw ₹" + amount);

        // wait if insufficient balance
        while (balance < amount) {
            System.out.println("Insufficient balance. Waiting for deposit...");

            try {
                wait(); // inter-thread communication
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: ₹" + balance);
    }

    // synchronized method for deposit
    synchronized void deposit(int amount) {

        System.out.println(Thread.currentThread().getName()
                + " depositing ₹" + amount);

        balance += amount;
        System.out.println("Deposit successful. Updated balance: ₹" + balance);

        notify(); // wake up waiting thread
    }
}

// Withdraw thread
class WithdrawThread extends Thread {

    private BankAccount account;

    WithdrawThread(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        account.withdraw(2000);
    }
}

// Deposit thread
class DepositThread extends Thread {

    private BankAccount account;

    DepositThread(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {

        try {
            Thread.sleep(3000); // delay deposit
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        account.deposit(3000);
    }
}
