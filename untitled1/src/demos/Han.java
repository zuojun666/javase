package demos;

public class Han {

    public static void move(int num,char x,char y){
        System.out.println(num+":"+x+"----->"+y);
    }

    public static void han(int size,char a,char b,char c){
        if(size>=1){
            han(size-1,a,c,b);
            move(size,a,c);
            han(size-1,b,a,c);
        }
    }

    public static void main(String[] args) {
        han(10,'A','B','C');
    }

}
