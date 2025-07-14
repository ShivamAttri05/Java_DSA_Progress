package Chapter_6;

public class Java_07_CheckPrime {

    public static boolean isprime(int n) {
        boolean isPrime = true;

        if (n == 1){
            return true;
        }

        if (n == 2){
            return true;
        }

        for (int i = 2; i<=n-1; i++){
            if(n%i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        System.out.println(isprime(1));
        System.out.println(isprime(2));
        System.out.println(isprime(3));
        System.out.println(isprime(4));
    }
}
