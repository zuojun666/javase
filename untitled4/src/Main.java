public class Main {
    public static int[] test(MyInterface myInterface){
        return myInterface.consumer(10);
    }
    public static void main(String[] args) {
        int[] test = test(int[]::new);
        System.out.println(test);
    }
}
