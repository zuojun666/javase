import java.io.*;

public class ReadObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream("C:\\objects.txt"));
        Object o = inputStream.readObject();
        System.out.println(o);
        inputStream.close();
    }
}
