import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServerSocket {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(10000);
        while (true){
            Socket socket = serverSocket.accept();
            new Thread(()->{
                try {
                    InputStream net_inputStream =new BufferedInputStream(socket.getInputStream());
                    OutputStream local_outputStream = new BufferedOutputStream(new FileOutputStream("D:\\img\\paimeng"+System.currentTimeMillis()+".jpg"));
                    byte[] bytes=new byte[1024];
                    int n;
                    while ((n=net_inputStream.read(bytes))!=-1)
                        local_outputStream.write(bytes,0,n);
                    local_outputStream.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();

        }
    }
}
