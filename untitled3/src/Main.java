
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Calculator calculator=(nums)->{
            int sum=0;
            for(int i:nums)
                sum+=i;
            return sum;
        };
        System.out.println(calculator.sum(1, 2, 3, 4));
    }
}
