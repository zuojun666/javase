package demos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class demo03 {

    public static List<String> list = new ArrayList<>();

    static {
        for (int i = 2; i < 10; i++) {
            for (int j = 0; j < 4; j++)
                list.add((char)(i+'0')+"");
        }
        for (int i = 0; i < 4; i++)
            list.add("10");
        for (int i = 0; i < 4; i++)
            list.add("J");
        for (int i = 0; i < 4; i++)
            list.add("Q");
        for (int i = 0; i < 4; i++)
            list.add("K");
        for (int i = 0; i < 4; i++)
            list.add("A");
        list.add("小王");
        list.add("大王");
    }

    public static void distribute(List<String> list,Student s1,Student s2,Student s3){
        Collections.shuffle(list);
        Random random = new Random();

        for(int i=0;i<17;i++){
            s1.getList().add(list.remove(0));
        }
        for(int i=0;i<17;i++){
            s2.getList().add(list.remove(0));
        }
        for(int i=0;i<17;i++){
            s3.getList().add(list.remove(0));
        }
    }

    public static void main(String[] args) {
        Student s1=new Student(),s2=new Student(),s3=new Student();
        distribute(list,s1,s2,s3);
        System.out.println(s1.getList()+"   "+s1.getList().size());
        System.out.println(s2.getList()+"   "+s2.getList().size());
        System.out.println(s3.getList()+"   "+s3.getList().size());
    }
}
