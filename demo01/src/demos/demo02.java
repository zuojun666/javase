package demos;

import java.util.TreeSet;

public class demo02 {


    public static int o(int...ar){
        int sum=0;
        for(int i:ar)
            sum+=i;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(o(1,2,3,4,5,6,7,8,9,0));
    }
}
