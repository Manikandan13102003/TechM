class Customer {
    int amount = 10000;

    // Synchronizing both methods to ensure thread safety
    synchronized void withdraw(int amount) {
        System.out.println("Going to withdraw...");

        // If insufficient balance, wait for a deposit
        if (this.amount < amount) {
            System.out.println("Less balance; waiting for deposit...");
            try {
                wait(); // Wait for deposit to be made
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // Once balance is sufficient, withdraw the amount
        this.amount -= amount;
        System.out.println("Withdraw completed...");
    }

    synchronized void deposit(int amount) {
        System.out.println("Going to deposit...");
        this.amount += amount;
        System.out.println("Deposit completed...");
        
        // Notify waiting thread that deposit is completed
        notify();
    }
}

public class Main {
    public static void main(String args[]) {
        Customer c = new Customer();

        // Thread to withdraw amount
        new Thread() {
            public void run() {
                c.withdraw(15000);
            }
        }.start();

        // Thread to deposit amount
        new Thread() {
            public void run() {
                c.deposit(10000);
            }
        }.start();
    }
}
