public class C_MoveThread
{
    public static void main(String[] args) throws InterruptedException
    {
        final Object lock = new Object();
        Thread t1 = new Thread(() -> {
            synchronized (lock)
            {
                System.out.println("Thread-1 has acquired the lock.");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread-1 is releasing the lock.");
            }
        }, "Thread-1");

        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread-2 is trying to acquire the lock.");
            synchronized (lock) {
                System.out.println("Thread-2 has acquired the lock.");
            }
        }, "Thread-2");
        t1.start();
        t2.start();
        Thread.sleep(200);
        System.out.println("State of Thread-2: " + t2.getState());
        t1.join();
        t2.join();
    }
}