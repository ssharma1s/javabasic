package statickeyword;

public class StaticExample {
    static int count=0;

    StaticExample(){
        count++;
    }

    public static int add (int a, int b){
        return a+b;
    }
}
