public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] Prime = new boolean[n + 1];

        for (int i = 2; i <= n; i++) {
            Prime[i] = true;
        }

        for (int p = 2; p * p <= n; p++) {
    
            if (Prime[p]) {
    
                for (int multiple = p * p; multiple <= n; multiple += p) {
                    Prime[multiple] = false;
                }
            }
        }
        int Counter = 0;
        System.out.printf("Prime numbers up to %d:", n);

        for (int i = 2; i <= n; i++) {
            if (Prime[i]) {
                Counter ++;
                System.out.println(i);
            }
        } 

        int primesPrecentage = Counter*100/n;
        System.out.printf("There are %d primes between 2 and %d (%d%% are primes)", Counter, n, primesPrecentage);
    }
}
