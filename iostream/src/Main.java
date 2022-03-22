import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        Reader reader=new InputStreamReader(new FileInputStream("D:\\出师表.txt"),"GBK");
        Writer writer=new OutputStreamWriter(new FileOutputStream("E:\\出师表.txt"));
        char[] chars=new char[1024];
        int n;
        while ((n=reader.read(chars))!=-1)
            writer.write(chars,0,n);
        writer.close();
        reader.close();
    }
}
