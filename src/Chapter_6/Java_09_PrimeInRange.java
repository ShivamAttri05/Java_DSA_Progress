package Chapter_6;

public class Java_09_PrimeInRange {

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

    public static void PrimeInRange(int n){
        for(int i = 2; i<=n-1; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PrimeInRange(12);
    }
}
