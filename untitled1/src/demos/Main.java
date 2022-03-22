package demos;

public class Main {

    public static int[] getNext(String substr){
        int[] next=new int[substr.length()];
        next[0]=-1;
        int i=0,j=-1;
        while (i<substr.length()-1){
            if(j==-1||substr.charAt(i)==substr.charAt(j)){
                i++;
                j++;
                next[i]=j;
            }else
                j=next[j];
        }
        return next;
    }

    public static int[] getNextVal(String substr,int[] next){
        int[] nextVal=new int[substr.length()];
        nextVal[0]=-1;
        for (int i = 1; i <substr.length(); i++) {
            if(substr.charAt(i)==substr.charAt(next[i])){
                nextVal[i]=nextVal[next[i]];
            }else
                nextVal[i]=next[i];
        }
        return nextVal;
    }

    public static int kmp_match(String str,String substr){
        int[] next=getNext(substr);
        int[] nextVal=getNextVal(substr,next);
        int i=-1,j=-1;
        while (i<str.length()&&j<substr.length()){
            if(j==-1||str.charAt(i)==str.charAt(j)){
                i++;
                j++;
            }else
                j=nextVal[j];
        }
        if(j>=substr.length())
            return i-substr.length()+1;
        else
            return -1;
    }

    public static void main(String[] args) {
        System.out.println(kmp_match("abcdefg","f"));
    }
}
