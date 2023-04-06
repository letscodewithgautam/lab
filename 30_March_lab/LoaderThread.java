package march_30_23_lab;

public class LoaderThread implements Runnable {
    private ListLoader listLoader;
    private int startNumber;
    private int lastNumber;

    public LoaderThread(ListLoader listLoader, int startNumber, int lastNumber) {
        this.listLoader = listLoader;
        this.startNumber = startNumber;
        this.lastNumber = lastNumber;
    }

    @Override
    public void run() {
        listLoader.loadList(startNumber, lastNumber);
    }
    public class MainThread {
        public static void main(String[] args) throws InterruptedException {
            ListLoader listLoader = new ListLoader();

            long startTime = System.currentTimeMillis();

            LoaderThread thread1 = new LoaderThread(listLoader, 0, 500000);
            LoaderThread thread2 = new LoaderThread(listLoader, 500000, 1000000);

            Thread t1 = new Thread(thread1);
            Thread t2 = new Thread(thread2);

            t1.start();
            t2.start();

            t1.join();
            t2.join();

            long endTime = System.currentTimeMillis();

            System.out.println("Time taken: " + (endTime - startTime) + "ms");
        }
    }
}