package UsingRunnableInterface;

public class BankRunnableDemo {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        Thread t1 = new Thread(new Withdraw(account), "Withdraw-Thread");
        Thread t2 = new Thread(new Deposit(account), "Deposit-Thread");

        // start()
        t1.start();
        t2.start();

        try {
            // join()
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Main thread completed");
    }
}

class BankAccount {

    int balance = 1000;

    synchronized void withdraw(int amount) {

        System.out.println(Thread.currentThread().getName()
                + " trying to withdraw ₹" + amount);

        if (balance < amount) {
            System.out.println("Not enough balance... waiting for deposit");

            try {
                wait(); // thread waits
            } catch (InterruptedException e) {
                System.out.println("Withdraw thread interrupted");
            }
        }

        balance -= amount;
        System.out.println("Withdraw completed. Balance = ₹" + balance);
    }

    synchronized void deposit(int amount) {

        System.out.println(Thread.currentThread().getName()
                + " depositing ₹" + amount);

        balance += amount;
        System.out.println("Deposit completed. Balance = ₹" + balance);

        notify(); // wake waiting thread
    }
}

// Withdraw Runnable
class Withdraw implements Runnable {

    BankAccount account;

    Withdraw(BankAccount account) {
        this.account = account;
    }

    public void run() {

        // yield example
        Thread.yield(); // hint scheduler to switch thread

        account.withdraw(2000);
    }
}

// Deposit Runnable
class Deposit implements Runnable {

    BankAccount account;

    Deposit(BankAccount account) {
        this.account = account;
    }

    public void run() {

        try {
            Thread.sleep(2000); // sleep example
        } catch (InterruptedException e) {
            System.out.println("Deposit thread interrupted");
        }

        account.deposit(3000);
    }
}
