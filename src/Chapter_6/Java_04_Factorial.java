package Chapter_6;

public class Java_04_Factorial {

    public static int fact(int num){
        int f = 1;
        for (int i = 1; i<=num; i++){
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
