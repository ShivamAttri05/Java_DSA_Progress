package Chapter_6;

public class Java_08_CheckPrimeOptimized {

    public static boolean isPrime(int n){
        boolean isPrime = true;

        if (n == 1){
            return true;
        }

        if (n == 2){
            return true;
        }

        for (int i = 2; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(1));
        System.out.println(isPrime(2));
        System.out.println(isPrime(3));
        System.out.println(isPrime(4));
    }
}
