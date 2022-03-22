package demos;

public class Main2 {
    public static int[] getNext(String substr){
        int[] next=new int[substr.length()+1];
        next[1]=0;
        int i=1,j=0;
        while (i<substr.length()){
            if(j==0||substr.charAt(i-1)==substr.charAt(j-1)){
                i++;
                j++;
                next[i]=j;
            }else
                j=next[j];
        }
        return next;
    }

    public static int[] getNextVal(String substr,int[] next){
        int[] nextVal=new int[substr.length()+1];
        nextVal[1]=0;
        for (int i = 2; i <=substr.length(); i++) {
            if(substr.charAt(i-1)==substr.charAt(next[i]-1))
                nextVal[i]=nextVal[next[i]];
            else
                nextVal[i]=next[i];
        }
        return nextVal;
    }

    public static int kmp_match(String str,String substr){
        int[] next=getNext(substr);
        int[] nextVal=getNextVal(substr,next);
        int i=1,j=1;
        while (i<=str.length()&&j<=substr.length()){
            if(j==0||str.charAt(i-1)==substr.charAt(j-1)){
                i++;
                j++;
            }else
                j=nextVal[j];
        }
        if(j>substr.length())
            return i-substr.length();
        else
            return 0;
    }

    public static void main(String[] args) {
        System.out.println(kmp_match("abcdefg","a"));
    }
}
