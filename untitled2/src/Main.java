
public class Main {
    public static final Object object=new Object();

    public static void main(String[] args) {
        Thread customer=new Thread(new Customer());
        Thread boss=new Thread(new Boss());
        customer.start();
        boss.start();

    }
}
