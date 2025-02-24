class Even extends Thread {
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println("Even: " + i);
        }
    }
}

class Odd extends Thread {
    public void run() {
        for (int i = 1; i <= 19; i += 2) {
            System.out.println("Odd: " + i);
        }
    }

    public static void main(String[] args) {
        Even evenThread = new Even();  
        Odd oddThread = new Odd();     

        evenThread.start();  
        oddThread.start();   
    }
}