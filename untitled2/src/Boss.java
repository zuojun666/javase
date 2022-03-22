public class Boss implements Runnable {
    public static boolean position;

    @Override
    public void run() {
        try {
            while (true) {
                synchronized (Main.object) {
                    if (!position) {
                        System.out.println("老板正在制作包子");
                        for (int i = 1; i <= 5; i++) {
                            Thread.sleep(500);
                            System.out.println("老板已经制作了" + i + "个包子");
                        }
                        System.out.println("制作完成");
                        position = true;
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
