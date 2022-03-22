import java.io.*;

public class WriteObject {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream("C:\\objects.txt"));
        Student student=new Student(1,"张三",10);
        outputStream.writeObject(student);
        outputStream.close();
        Writer writer=new FileWriter("C:\\");
        BufferedWriter bufferedWriter=new BufferedWriter(writer);
        PrintStream printStream=new PrintStream(new FileOutputStream("C:\\a.txt"));

    }
}
