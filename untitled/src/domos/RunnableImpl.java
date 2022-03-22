package domos;

public class RunnableImpl implements Runnable{
    public static int tickets=100;
    public static final Object object=new Object();
    @Override
    public void run() {
        while (true){
            synchronized (object){
                if(tickets<=0)
                    break;
                System.out.println("线程"+Thread.currentThread().getName()+"正在卖第"+tickets+"张票");
                tickets--;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
