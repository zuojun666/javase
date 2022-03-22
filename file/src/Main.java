import java.io.*;

public class Main {
    public static void list(File file){
        File[] files = file.listFiles();
        if(files!=null){
            for (File file1 : files) {
                System.out.println(file1.getAbsolutePath());
                if(file1.isDirectory())
                    list(file1);
            }
        }
    }

    public static void main1(String[] args) throws IOException {
        File dpan=new File("E:\\");
        list(dpan);
    }

    public static int digui(int n){
        if(n==1)
            return 1;
        else
            return n*digui(n-1);
    }

    public static void search(File file,String suffix){
        if(file!=null&&file.isDirectory()){
            File[] files = file.listFiles();
            if(files!=null){
                for (File file1 : files) {
                    if(file1.isDirectory())
                        search(file1,suffix);
                    else if(file1.isFile()&&file1.getName().endsWith(suffix))
                        System.out.println(file1.getAbsolutePath());
                }
            }
        }
    }

    public static void search1(File file,String suffix){
        if(file!=null&&file.isDirectory()){
            File[] files = file.listFiles(o->o.isDirectory()||o.getName().endsWith(suffix));
            if(files!=null){
                for (File file1 : files) {
                    if(file1.isDirectory())
                        search1(file1,suffix);
                    else
                        System.out.println(file1.getAbsolutePath());
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        File file=new File("D:\\");
        search1(file,".exe");
    }
}
