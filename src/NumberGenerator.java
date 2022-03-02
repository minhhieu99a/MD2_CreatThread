public class NumberGenerator implements Runnable {
    private Thread thread;

    public void start() {
        thread = new Thread(this, "creatThread");
        System.out.println(thread);
        thread.start();
    }

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + "a ");
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
