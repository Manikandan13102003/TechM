public class Main {

    public static void main(String[] args) {
        System.out.println("From Main thread!");

        // Creating and starting the ThreadOne
        MTask1ThreadOne t1 = new MTask1ThreadOne();
        t1.start(); // Start ThreadOne (calls the run method)

        // Creating and starting the ThreadTwo
        MTask1ThreadTwo t2 = new MTask1ThreadTwo();
        t2.start(); // Start ThreadTwo (calls the run method)

        // Call the run method once directly from the main thread
        System.out.println("Executing run method from Main thread directly:");
        new MTask1ThreadOne().run(); // Call the run method of ThreadOne directly from the main thread
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
}
