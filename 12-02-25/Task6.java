public class Main {

    public static void main(String[] args) {
        System.out.println("From Main thread!");

        // Creating and starting ThreadOne
        MTask1ThreadOne t1 = new MTask1ThreadOne();
        t1.start(); // Start ThreadOne (calls the run method)

        // Creating and starting ThreadTwo
        MTask1ThreadTwo t2 = new MTask1ThreadTwo();
        t2.start(); // Start ThreadTwo (calls the run method)

        // Creating and starting ThreadThree
        MTask1ThreadThree t3 = new MTask1ThreadThree();
        t3.start(); // Start ThreadThree (calls the run method)

        // Creating and starting ThreadRunnableOne using Runnable
        ThreadRunnableOne runnable1 = new ThreadRunnableOne();
        Thread thread1 = new Thread(runnable1);
        thread1.start(); // Start ThreadRunnableOne (calls the run method of the Runnable)
    }

    // Class ThreadOne extends Thread
    static class MTask1ThreadOne extends Thread {
        @Override
        public void run() {
            // Print three times from ThreadOne
            System.out.println("From ThreadOne!");
            System.out.println("From ThreadOne!");
            System.out.println("From ThreadOne!");
        }
    }

    // Class ThreadTwo extends Thread
    static class MTask1ThreadTwo extends Thread {
        @Override
        public void run() {
            // Print two times from ThreadTwo
            System.out.println("From ThreadTwo!");
            System.out.println("From ThreadTwo!");

            // Dividing by zero to cause ArithmeticException
            System.out.println(10 / 0); // This will throw an ArithmeticException
        }
    }

    // Class ThreadThree extends Thread
    static class MTask1ThreadThree extends Thread {
        @Override
        public void run() {
            // Print five times from ThreadThree
            System.out.println("From ThreadThree!");
            System.out.println("From ThreadThree!");
            System.out.println("From ThreadThree!");
            System.out.println("From ThreadThree!");
            System.out.println("From ThreadThree!");
        }
    }

    // Class ThreadRunnableOne implements Runnable
    static class ThreadRunnableOne implements Runnable {
        @Override
        public void run() {
            // Print two times from ThreadRunnableOne
            System.out.println("From ThreadRunnableOne!");
            System.out.println("From ThreadRunnableOne!");
        }
    }
}
