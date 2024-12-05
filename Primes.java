public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] numSpecials =  new boolean[n+1];
        for (int i = 0; i <= n; i++) {
            numSpecials[i] = true;
            if (i <= 1) {
                numSpecials[i] = false; 
            }
        }
        System.out.println("Prime numbers up to "+n+":");
        int counterSpecials = 0;
        for (int i = 0; i <= n; i++) {
            if (numSpecials[i]) {
                System.out.println(i);
                counterSpecials ++;
                for (int j = 2*i; j <= n; j+=i) {
                    numSpecials[j] = false;
                }
            }
        }
        System.out.println("There are "+counterSpecials+" primes between 2 and "+n+" ("+(int) ((double) (100*counterSpecials) / (double) n)+"% are primes)");

    }
}
