public class Customer implements Runnable {

    @Override
    public void run() {
        try {
            while (true) {
                synchronized (Main.object) {
                    if (Boss.position) {
                        System.out.println("客人正在吃包子");
                        Boss.position = false;
                        Thread.sleep(5000);
                    }
                    Main.object.notify();
                    Main.object.wait();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
