import java.io.*;
import java.net.Socket;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MySocket {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("localhost",10000);
        OutputStream net_outputStream=new BufferedOutputStream(socket.getOutputStream());
        InputStream local_inputStream=new BufferedInputStream(new FileInputStream("C:\\Users\\Administrator.DESKTOP-6PQJ4G2\\Pictures\\paimeng.jpg"));
        byte[] bytes=new byte[1024];
        int n;
        while ((n=local_inputStream.read(bytes))!=-1)
            net_outputStream.write(bytes,0,n);
        socket.shutdownOutput();
        socket.close();
        int[] ar=new int[10];
        Stream<int[]> ar1 = Stream.of(ar);
        IntStream intStream = Arrays.stream(ar);

    }
}
