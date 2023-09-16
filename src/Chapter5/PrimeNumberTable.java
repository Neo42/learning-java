package Chapter5;

public class PrimeNumberTable {
    public static void main(String[] args) {
        boolean[] isPrime = new boolean[100];
        for (int i = 2; i < isPrime.length; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i]) {
                for (int k = 2; i * k < isPrime.length; k++) {
                    isPrime[i * k] = false; // mark all number that can be divided by i as non-prime numbers.
                }
            }
        }
        for (int i = 0; i < isPrime.length; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
